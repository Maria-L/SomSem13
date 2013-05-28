create or replace view stammVoegel as select "b_id","b_category","b_scientific_name","b_english_name","b_range","b_order","b_family","de_id","de_deutsch","de_englisch","de_latein","ioc_id","ioc_family","ioc_scientific_name","ioc_english_name","ioc_german_name" from birds b, birds_de bd, birds_ioc ioc
where b.b_scientific_name=bd.DE_latein(+)
and b.B_scientific_name=ioc.ioc_scientific_name(+);

create or replace view voegel as select * from MERLIN.vbirds 
where NOT((stammvoegel.b_category = 'species' or stammvoegel.b_category = 'group (polytypic)') and stammvoegel.de_deutsch is null and  stammvoegel.ioc_german_name is null);

create or replace view voegel1 as select "b_id", "b_category","b_scientific_name","b_english_name","de_deutsch","de_englisch","de_latein","ioc_scientific_name","ioc_german_name" 
from voegel;

create or replace view voegel2 as select "b_id", "b_scientific_name", "ioc_german_name" (select voegel1.de_deutsch from voegel1 when voegel1.ioc_german_name is null) from voegel1;
                                                                              

