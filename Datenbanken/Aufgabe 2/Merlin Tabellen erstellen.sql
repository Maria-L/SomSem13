select * from MERLIN.birds_DE, MERLIN.birds where de_englisch = b_english_name
  and merlin.birds_de.de_latein != merlin.birds.b_scientific_name;
  
select * from MERLIN.vbirds;
