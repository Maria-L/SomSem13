select * from MERLIN.birds_de where EXISTS (select * from MERLIN.birds, MERLIN.birds_de where merlin.birds.b_scientific_name = merlin.birds_de.de_latein);
