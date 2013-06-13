/* Aufgabe 9 a*/
select distinct * from voegel v
  WHERE EXISTS (select * from beobachtet b where v.vogelid = b.vogelid
                                            and b.benutzername = 'Maria Luedemann');
                                                            
<<<<<<< HEAD
/* Aufgabe 9 b*/
select * from voegel v
  WHERE NOT EXISTS (select * from beobachtet b where v.vogelid = b.vogelid
                                                and b.benutzername = 'Maria Luedemann')
    AND EXISTS (select * from checkliste ch where v.vogelid = ch.vogelid);
  
/* Aufgabe 9 c*/
SELECT BenutzerName, VogelID, min(BeobBeginn) FROM beobachtet b
Group BY b.BenutzerName, b.VogelID;

select count(*) from voegel where kategorie = 'subspecies';
=======
select * from checkliste ch where ch.land = 'de';

/* Aufgabe 9 b*/
select distinct * from voegel v, checkliste ch
  WHERE NOT EXISTS (select * from beobachtet b where v.vogelid = b.vogelid)
  AND ch.land = 'de';
  
/* Aufgabe 9 c*/
SELECT BenutzerID, VogelID, min(BeobBeginn) FROM beobachtetS
Group BY BenutzerID, VogelID
>>>>>>> bc701399996e2d53ec920775c857db08ec81c657
