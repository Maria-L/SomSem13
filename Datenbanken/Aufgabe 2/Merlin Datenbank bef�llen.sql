/*############################################################################################################*/
/*Bindet MERLIN.birds mit den deutschen namen von MERLIN.birds_ioc abhängig vom latainischen namen in voegel_ ein*/
INSERT INTO VOEGEL_
  (VogelID, Latainischer_Name, Kategorie, Deutscher_Name, Englischer_Name)
SELECT
  merlin.birds.b_id,
  merlin.birds.b_scientific_name,
  merlin.birds.b_category,
  merlin.birds_ioc.ioc_german_name,
  merlin.birds.b_english_name
FROM MERLIN.birds, MERLIN.birds_ioc WHERE birds_ioc.ioc_scientific_name = merlin.birds.b_scientific_name
                                    AND not merlin.birds_ioc.ioc_german_name is null
                                    AND (merlin.birds.b_category = 'species' OR merlin.birds.b_category = 'group (polytypic)');
/*############################################################################################################*/

/*Soll Datensätze in Kombination von birds und birds_de in voegel_ einfügen, die noch fehlen*/
INSERT INTO VOEGEL_
  (VogelID, Latainischer_Name, Kategorie, Deutscher_Name, Englischer_Name)
SELECT
  merlin.birds.b_id,
  merlin.birds.b_scientific_name,
  merlin.birds.b_category,
  merlin.birds_de.de_deutsch,
  merlin.birds.b_english_name
FROM MERLIN.birds, MERLIN.birds_de, voegel_ WHERE   birds_de.de_latein = merlin.birds.b_scientific_name
                                            AND     birds_de.de_latein != voegel_.latainischer_name
                                            AND not merlin.birds_de.de_deutsch is null;

/*############################################################################################################*/
/*Fügt alle Einträge aus MERLIN.birds nach, die zur Kategorie Group(*) oder subspecies gehören*/
INSERT INTO VOEGEL_
  (VogelID, Latainischer_Name, Kategorie, englischer_name)
SELECT
  merlin.birds.b_id,
  merlin.birds.b_scientific_name,
  merlin.birds.b_category,
  merlin.birds.b_english_name
FROM MERLIN.birds WHERE birds.b_category = 'group (monotypic)' 
                  /*OR birds.b_category = 'group (polytypic)'*/
                  /*OR birds.b_category = 'subspecies'*/;
/*############################################################################################################*/

