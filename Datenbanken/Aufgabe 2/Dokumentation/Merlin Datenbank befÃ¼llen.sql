/*################################################ BEGINN TABELLEN ERSTELLEN ############################################################*/
create table Voegel
  (VogelID integer not null PRIMARY KEY,
  Kategorie         varchar2(20) not null,
  Latainischer_Name varchar2(80) unique not null,
  Englischer_Name   varchar2(70),
  Deutscher_Name    varchar2(50), /*Ist nicht not null, weil es einen sehr viel größeren Aufwand erzeugt hätte, die Tabellen zu befüllen*/
  check(Kategorie in ('species', 'subspecies', 'group (monotypic)', 'group (polytypic)'))
  );
  
create table Beobachtungsort
  (BeobachtungsortID integer not null PRIMARY KEY,
  Beobachtungsort       varchar2(500) not null,
  Staat                 varchar2(40),
  Zoographische_Region  varchar2(50)
  );
  
create table Benutzer
  (BenutzerName         varchar2(60) not null PRIMARY KEY,
  EMail_Addresse        varchar2(100) unique not null,
  Rolle                 integer not null
  );
  
create table Checkliste
  (VogelID              integer not null,
  BeobachtungsID        integer not null,
  PRIMARY KEY(VogelID,BeobachtungsID),
  FOREIGN KEY(VogelID)        references Voegel,
  FOREIGN KEY(BeobachtungsID) references Beobachtungsort
  );
  
create table Beobachtet
  (BeobachtungsID     integer not null PRIMARY KEY,
  BenutzerName        varchar2(60) not null,
  BeobachtungsortID   integer not null,
  VogelID             integer not null,
  BeobBeginn          date,
  BeobEnde            date,
  Kommentar           clob,
  FOREIGN KEY(BenutzerName)       references Benutzer,
  FOREIGN KEY(BeobachtungsortID)  references Beobachtungsort,
  FOREIGN KEY(VogelID)            references Voegel
  );
/*################################################ BEGINN TABELLEN BEFÜLLEN ############################################################*/
/*Fügt alle Einträge aus MERLIN.birds nach VOEGEL*/
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

/*Schiebe die englischen Namen aus BIRDS_DE in die betreffenden Tupel aus VOEGEL, wobei bestehende Einträge nicht überschrieben werden*/
UPDATE VOEGEL
  SET VOEGEL.englischer_name = (select MERLIN.BIRDS_DE.de_englisch
                                from MERLIN.BIRDS_DE
                                where latainischer_name = MERLIN.BIRDS_DE.de_latein)
  WHERE englischer_name is null;

/*Schiebe die englischen Namen aus BIRDS_IOC in die betreffenden Tupel aus VOEGEL, wobei bestehende Einträge nicht überschrieben werden*/  
UPDATE VOEGEL
  SET VOEGEL.englischer_name = (select MERLIN.BIRDS_IOC.ioc_english_name
                                from MERLIN.BIRDS_IOC
                                where latainischer_name = MERLIN.BIRDS_IOC.ioc_scientific_name)
  WHERE englischer_name is null;
                                
 /*Species und dazugehörige Subspecies ohne deutschen Namen werden gelöscht*/                         
delete from voegel where 
    (trim(substr(latainischer_name, 1, instr(latainischer_name, ' ',1, 2))) in (select trim(latainischer_name) 
                                                                                from voegel 
                                                                                where deutscher_name is null 
                                                                                and kategorie = 'species') 
    or 
    deutscher_name is null and kategorie = 'species');

/*Fülle die ranges aus BIRDS in BEOBACHTUNGSORT, wobei doppelte nicht mit kopiert werden und überflüssige b_id's für das select gelöscht werden*/
INSERT INTO BEOBACHTUNGSORT
  (beobachtungsortID, beobachtungsort)
SELECT 
  min(merlin.birds.b_id), 
  merlin.birds.b_range
FROM merlin.birds where merlin.birds.b_range is not null group by merlin.birds.b_range;

/*Befülle die Checkliste*/
INSERT INTO CHECKLISTE
  (vogelid, beobachtungsid)
SELECT
  vogelid, 
  beobachtungsortid 
FROM voegel v, merlin.birds mb, beobachtungsort b where v.latainischer_name = mb.b_scientific_name 
                                                  and b.beobachtungsort = mb.b_range ;
                                                  
/*################################################  BEGINN TABELLEN LÖSCHEN  ############################################################*/

drop table beobachtet cascade constraints PURGE;
drop table checkliste cascade constraints PURGE;
drop table Beobachtungsort cascade constraints PURGE;
drop table Voegel cascade constraints PURGE;
drop table benutzer cascade constraints PURGE;