select distinct * from voegel v
  WHERE EXISTS (select * from beobachtet b, checkliste ch where v.vogelid = b.vogelid
                                                            and ch.land = 'de');
                                                            
select * from checkliste ch where ch.land = 'de';