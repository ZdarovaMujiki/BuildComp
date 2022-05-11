CREATE TABLE Management (
                            id int PRIMARY KEY,
                            name varchar NOT NULL
);

CREATE TABLE Sector (
                        id int PRIMARY KEY,
                        name varchar NOT NULL,
                        management_ID int NOT NULL,
                        FOREIGN KEY (management_ID) REFERENCES Management(id)
);

CREATE TABLE Personnel (
                           id int PRIMARY KEY,
                           name varchar NOT NULL,
                           duty varchar NOT NULL,
                           sectorID int NOT NULL,
                           FOREIGN KEY (sectorID) REFERENCES Sector(id)
);

CREATE TABLE SectorManager (
                               id int PRIMARY KEY,
                               FOREIGN KEY (id) REFERENCES Personnel(id)
);

CREATE TABLE ManagementManager (
                                   id int PRIMARY KEY,
                                   FOREIGN KEY (id) REFERENCES Personnel(id)
);

CREATE TABLE Brigade (
                         id int PRIMARY KEY,
                         name varchar NOT NULL
);

CREATE TABLE Worker (
                        id int PRIMARY KEY,
                        name varchar NOT NULL,
                        sectorID int,   --?
                        brigadeID int,
                        FOREIGN KEY (sectorID) REFERENCES Sector(id),
                        FOREIGN KEY (brigadeID) REFERENCES Brigade(id)
);

CREATE TABLE Brigadier (
                           id int PRIMARY KEY,
                           FOREIGN KEY (id) REFERENCES Worker(id)
);

CREATE TABLE BuildingObject (
                                id int PRIMARY KEY,
                                name varchar NOT NULL,
                                client varchar NOT NULL,
                                sectorID int NOT NULL,
                                FOREIGN KEY (sectorID) REFERENCES Sector(id)
);

CREATE TABLE Bridge (
                        id int PRIMARY KEY,
                        span int NOT NULL DEFAULT 1 CHECK (span > 0),
                        FOREIGN KEY (id) REFERENCES BuildingObject(id)
);

CREATE TABLE House (
                       id int PRIMARY KEY,
                       floors int NOT NULL DEFAULT 1 CHECK (floors > 0),
                       FOREIGN KEY (id) REFERENCES BuildingObject(id)
);

CREATE TABLE Work (
                      id int PRIMARY KEY,
                      name varchar NOT NULL,
                      objectID int NOT NULL,
                      brigadeID int NOT NULL,
                      plannedStartDate date NOT NULL,
                      plannedEndDate date NOT NULL,
                      realStartDate date,
                      realEndDate date,
                      FOREIGN KEY (objectID) REFERENCES BuildingObject(id),
                      FOREIGN KEY (brigadeID) REFERENCES Brigade(id),
                      CHECK (plannedStartDate < plannedEndDate AND realStartDate < realEndDate)
);

CREATE TABLE Resource (
                          id int PRIMARY KEY,
                          name varchar NOT NULL,
                          measure varchar NOT NULL
);

CREATE TABLE ResourceAtWork (
                                workID int,
                                resourceID int,
                                plannedAmount float4 NOT NULL,
                                usedAmount float4,
                                PRIMARY KEY (resourceID, workID),
                                FOREIGN KEY (resourceID) REFERENCES Resource(id),
                                FOREIGN KEY (workID) REFERENCES Work(id),
                                CHECK (plannedAmount > 0 AND usedAmount > 0)
);

CREATE TABLE Tech (
                      id int PRIMARY KEY,
                      name varchar NOT NULL,
                      managementID int,
                      FOREIGN KEY (managementID) REFERENCES Management(id)
);

CREATE TABLE TechAtWork (
                            workID int,
                            techID int,
                            PRIMARY KEY (workID, techID),
                            FOREIGN KEY (workID) REFERENCES Work(id),
                            FOREIGN KEY (techID) REFERENCES Tech(id)
);