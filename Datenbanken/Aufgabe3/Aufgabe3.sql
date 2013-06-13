<<<<<<< HEAD
INSERT INTO BENUTZER VALUES ('Steffen Giersch', 'artanoah@gmail.com', 1);
INSERT INTO BENUTZER VALUES ('Maria Luedemann', 'maria.luedemann@haw-mail.de', 2);
INSERT INTO BENUTZER VALUES ('Birger Kamp', 'birger.kamp@haw-mail.de', 3);

=======
>>>>>>> bc701399996e2d53ec920775c857db08ec81c657
/*Bedingung 6 Bei Beobachtungen müssen die Orte vorher schon existieren
  Bedingung 8 Man kann nur Vögel beobachten die in der Checkliste sind
  
  Anweisung für JDBC Die Variablen müssen aus dem Script kommen sonst muss man die Ids kennen
*/
<<<<<<< HEAD
INSERT INTO Beobachtet /*(BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) */
SELECT 10,'Steffen Giersch',1,256,'01-01-2000','01-01-2000','Dance' FROM dual
  WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE Beobachtungsort.BeobachtungsortID = 1)
    AND EXISTS (SELECT VogelID FROM Checkliste ch WHERE ch.VogelID = 256);
    
INSERT INTO Beobachtet /*(BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) */
SELECT 11,'Steffen Giersch',1,256,'01-01-2001','01-01-2001','Dance no 2' FROM dual
  WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE Beobachtungsort.BeobachtungsortID = 1)
    AND EXISTS (SELECT VogelID FROM Checkliste ch WHERE ch.VogelID = 256);
    
INSERT INTO Beobachtet /*(BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) */
SELECT 12,'Maria Luedemann',1,256,'01-01-2005','01-01-2005','Flying and stuff' FROM dual
  WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE Beobachtungsort.BeobachtungsortID = 1)
    AND EXISTS (SELECT VogelID FROM Checkliste ch WHERE ch.VogelID = 256);
    
INSERT INTO Beobachtet /*(BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) */
SELECT 13,'Maria Luedemann',1,256,'01-01-2006','01-01-2006','Flying and stuff' FROM dual
  WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE Beobachtungsort.BeobachtungsortID = 1)
    AND EXISTS (SELECT VogelID FROM Checkliste ch WHERE ch.VogelID = 256);
                                                    
select * from MERLIN.BIRDS_DE bde WHERE NOT EXISTS(select * from MERLIN.BIRDS mb WHERE mb.b_scientific_name = bde.de_latein);
select count(*) from MERLIN.BIRDS_de;

delete from Beobachtet;

select * from voegel where deutscher_name = 'Brauntinamu';

INSERT INTO Beobachtungsort (beobachtungsortid, staat, zoographische_region) VALUES (3, 'D', 'WP');

INSERT INTO Beobachtet (BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde)
SELECT 18,'Maria Luedemann',3,69,'01.02.2012','01.02.2012' FROM dual
  WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE Beobachtungsort.BeobachtungsortID = 1)
    AND EXISTS (SELECT VogelID FROM Checkliste ch WHERE ch.VogelID = 69);
    
select * from Checkliste where vogelid = 415;
=======
("INSERT INTO Beobachtet (BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) 
VALUES ("+Beoid+",'"+user+"',"+BID+","+VID+","+Beginn+", "+Ende+",'"+Kommentar+"')
WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE BeobachtungsortID.Beobachtungsort = "+BID+")
AND EXISTS (SELECT VogelID FROM Checkliste WHERE VogelID.Checkliste = "+VID+")")
>>>>>>> bc701399996e2d53ec920775c857db08ec81c657
