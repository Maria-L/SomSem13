INSERT INTO VOEGEL
  (VogelID, Latainischer_Name, Kategorie)
SELECT
  BIRTDS.B_ID,
  BIRDS.B_SCIENTIFIC_NAME,
  BIRDS.B_CATEGORY
FROM Merlin.BIRDS, Merlin.birds_de, Merlin.birds_ioc;