INSERT INTO BENUTZER VALUES ('Steffen Giersch', 'artanoah@gmail.com', 1);
INSERT INTO BENUTZER VALUES ('Maria Luedemann', 'maria.luedemann@haw-mail.de', 2);
INSERT INTO BENUTZER VALUES ('Birger Kamp', 'birger.kamp@haw-mail.de', 3);

INSERT INTO BEOBACHTET 
  VALUES (1, 'Maria Luedemann', 1725, 1725, '09-03-1992', '09-03-1993', 'Ich tanze im Kreis');
INSERT INTO BEOBACHTET
  VALUES (2, 'Steffen Giersch', 25976, 25976, '04-11-2005', '21-05-2006', 'Die Welt ist schoen');
INSERT INTO BEOBACHTET
  VALUES (3, 'Birger Kamp', 24762, 24762, '01-01-2010', '02-01-2010', 'Die Welt ist schlecht');
  
SELECT * FROM BEOBACHTET;
delete from beobachtet;