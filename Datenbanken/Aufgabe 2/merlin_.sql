select vogelid, latainischer_name, deutscher_name, case 
    when deutscher_name is null then 'delete' 
    when deutscher_name is not null then 'keep'
    end from voegel where kategorie = 'species';