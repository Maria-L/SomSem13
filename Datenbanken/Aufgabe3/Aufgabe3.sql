/*Bedingung 6 Bei Beobachtungen m�ssen die Orte vorher schon existieren
  Bedingung 8 Man kann nur V�gel beobachten die in der Checkliste sind
  
  Anweisung f�r JDBC Die Variablen m�ssen aus dem Script kommen sonst muss man die Ids kennen
*/
("INSERT INTO Beobachtet (BeobachtungsID,BenutzerName,BeobachtungsortID,VogelID,BeobBeginn,BeobEnde,Kommentar) 
VALUES ("+Beoid+",'"+user+"',"+BID+","+VID+","+Beginn+", "+Ende+",'"+Kommentar+"')
WHERE EXISTS (SELECT BeobachtungsortID FROM Beobachtungsort WHERE BeobachtungsortID.Beobachtungsort = "+BID+")
AND EXISTS (SELECT VogelID FROM Checkliste WHERE VogelID.Checkliste = "+VID+")")