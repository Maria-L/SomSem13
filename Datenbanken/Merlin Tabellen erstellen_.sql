create table Voegel_ 
  (VogelID integer not null PRIMARY KEY,
  Kategorie         varchar2(20) not null,
  Latainischer_Name varchar2(80) unique not null,
  Englischer_Name   varchar2(70),
  Deutscher_Name    varchar2(50),
  check(Kategorie in ('species', 'subspecies', 'group (monotypic)', 'group (polytypic)'))
  );
  
create table Beobachtungsort_
  (BeobachtungsortID integer not null PRIMARY KEY,
  Beobachtungsort       varchar2(100) not null,
  Staat                 varchar2(40),
  Zoographische_Region  varchar2(50)
  );
  
create table Benutzer_
  (BenutzerName         varchar2(60) not null PRIMARY KEY,
  EMail_Addresse        varchar2(100) unique not null,
  Rolle                 integer not null
  );
  
create table Checkliste_
  (VogelID              integer not null,
  BeobachtungsID        integer not null,
  PRIMARY KEY(VogelID,BeobachtungsID),
  FOREIGN KEY(VogelID)        references Voegel,
  FOREIGN KEY(BeobachtungsID) references Beobachtungsort
  );
  
create table Beobachtet_
  (BeobachtungsID     integer not null PRIMARY KEY,
  BenutzerName        varchar2(60) not null,
  BeobachtungsortID   integer not null,
  VogelID             integer not null,
  BeobBeginn          date,
  BeobEnde            date,
  Kommentar           clob,
  FOREIGN KEY(BenutzerName)       references Benutzer,
  FOREIGN KEY(BeobachtungsortID)  references Beobachtungsort,
  FOREIGN KEY(VogelID)            references Voegel
  );