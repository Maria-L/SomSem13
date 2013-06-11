/* Aufgabe 9 a*/
select distinct * from voegel v
  WHERE EXISTS (select * from beobachtet b, checkliste ch where v.vogelid = b.vogelid
                                                            and ch.land = 'de');
                                                            
select * from checkliste ch where ch.land = 'de';

/* Aufgabe 9 b*/
select distinct * from voegel v, checkliste ch
  WHERE NOT EXISTS (select * from beobachtet b where v.vogelid = b.vogelid)
  AND ch.land = 'de';
  
/* Aufgabe 9 c*/
SELECT BenutzerID, VogelID, min(BeobBeginn) FROM beobachtetS
Group BY BenutzerID, VogelID