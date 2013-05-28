/*################################################ BEGINN ############################################################*/
/*F�gt alle Eintr�ge aus MERLIN.birds nach VOEGEL*/
INSERT INTO VOEGEL
  (VogelID, Latainischer_Name, Kategorie, englischer_name)
SELECT
  merlin.birds.b_id,
  merlin.birds.b_scientific_name,
  merlin.birds.b_category,
  merlin.birds.b_english_name
FROM MERLIN.birds;

/*Schiebe die deutschen Namen aus BIRDS_DE in die betreffenden Tupel aus VOEGEL*/
UPDATE VOEGEL
  SET VOEGEL.deutscher_name = ( select MERLIN.BIRDS_DE.de_deutsch 
                                from MERLIN.BIRDS_DE 
                                where latainischer_name = MERLIN.BIRDS_DE.de_latein);

/*Schiebe die deutschen Namen aus BIRDS_DE in die betreffenden Tupel aus VOEGEL, wobei nicht kopiert wird, wenn der zu kopierende Wert (null) ist*/
UPDATE VOEGEL
  SET VOEGEL.deutscher_name = ( select MERLIN.BIRDS_IOC.IOC_GERMAN_NAME 
                                from MERLIN.BIRDS_IOC 
                                where latainischer_name = MERLIN.BIRDS_IOC.IOC_SCIENTIFIC_NAME) 
  where (select MERLIN.BIRDS_IOC.IOC_GERMAN_NAME 
    from MERLIN.BIRDS_IOC where latainischer_name = MERLIN.BIRDS_IOC.IOC_SCIENTIFIC_NAME) is not null;

/*Schiebe die englischen Namen aus BIRDS_DE in die betreffenden Tupel aus VOEGEL, wobei bestehende Eintr�ge nicht �berschrieben werden*/
UPDATE VOEGEL
  SET VOEGEL.englischer_name = (select MERLIN.BIRDS_DE.de_englisch
                                from MERLIN.BIRDS_DE
                                where latainischer_name = MERLIN.BIRDS_DE.de_latein)
  WHERE englischer_name is null;

/*Schiebe die englischen Namen aus BIRDS_IOC in die betreffenden Tupel aus VOEGEL, wobei bestehende Eintr�ge nicht �berschrieben werden*/  
UPDATE VOEGEL
  SET VOEGEL.englischer_name = (select MERLIN.BIRDS_IOC.ioc_english_name
                                from MERLIN.BIRDS_IOC
                                where latainischer_name = MERLIN.BIRDS_IOC.ioc_scientific_name)
  WHERE englischer_name is null;
                                
 /*Species und dazugeh�rige Subspecies ohne deutschen Namen werden gel�scht*/                         
delete from voegel where 
    (trim(substr(latainischer_name, 1, instr(latainischer_name, ' ',1, 2))) in (select trim(latainischer_name) 
                                                                                from voegel 
                                                                                where deutscher_name is null 
                                                                                and kategorie = 'species') 
    or 
    deutscher_name is null and kategorie = 'species');

/*F�lle die ranges aus BIRDS in BEOBACHTUNGSORT, wobei doppelte nicht mit kopiert werden und �berfl�ssige b_id's f�r das select gel�scht werden*/
INSERT INTO BEOBACHTUNGSORT
  (beobachtungsortID, beobachtungsort)
SELECT 
  min(merlin.birds.b_id), 
  merlin.birds.b_range
FROM merlin.birds where merlin.birds.b_range is not null group by merlin.birds.b_range;

/*Bef�lle die Checkliste*/
INSERT INTO CHECKLISTE
  (vogelid, beobachtungsid)
SELECT
  vogelid, 
  beobachtungsortid 
FROM voegel v, merlin.birds mb, beobachtungsort b where v.latainischer_name = mb.b_scientific_name 
                                                  and b.beobachtungsort = mb.b_range ;
                                                  
/*Da nicht genug Platz in der Datenbank war um die Checkliste einzuf�gen haben wir noch einen View erstellt, der den Inhalt der Checkliste darstellt*/
create or replace view checkliste_view as 
  select vogelid, beobachtungsortid from voegel v, merlin.birds mb, beobachtungsort b 
    where v.latainischer_name = mb.b_scientific_name 
    and b.beobachtungsort = mb.b_range;
select * from checkliste_view;
/*################################################  ENDE  ############################################################*/
