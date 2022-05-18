CREATE TABLE Management (
                            id SERIAL PRIMARY KEY,
                            name varchar NOT NULL
);

CREATE TABLE Sector (
                        id SERIAL PRIMARY KEY,
                        name varchar NOT NULL,
                        management_ID int NOT NULL,
                        FOREIGN KEY (management_ID) REFERENCES Management(id)
);

CREATE TABLE Personnel (
                           id SERIAL PRIMARY KEY,
                           name varchar NOT NULL,
                           duty varchar NOT NULL,
                           sector_ID int NOT NULL,
                           FOREIGN KEY (sector_ID) REFERENCES Sector(id)
);

CREATE TABLE Sector_Manager (
                               id int PRIMARY KEY,
                               FOREIGN KEY (id) REFERENCES Personnel(id)
);

CREATE TABLE Management_Manager (
                                   id int PRIMARY KEY,
                                   FOREIGN KEY (id) REFERENCES Personnel(id)
);

CREATE TABLE Brigade (
                         id SERIAL PRIMARY KEY,
                         name varchar NOT NULL
);

CREATE TABLE Worker (
                        id SERIAL PRIMARY KEY,
                        name varchar NOT NULL,
                        sector_ID int,   --?
                        brigade_ID int,
                        FOREIGN KEY (sector_ID) REFERENCES Sector(id),
                        FOREIGN KEY (brigade_ID) REFERENCES Brigade(id)
);

CREATE TABLE Brigadier (
                           id int PRIMARY KEY,
                           FOREIGN KEY (id) REFERENCES Worker(id)
);

CREATE TABLE Building_Object (
                                id SERIAL PRIMARY KEY,
                                name varchar NOT NULL,
                                client varchar NOT NULL,
                                sector_ID int NOT NULL,
                                FOREIGN KEY (sector_ID) REFERENCES Sector(id)
);

CREATE TABLE Bridge (
                        id int PRIMARY KEY,
                        span int NOT NULL DEFAULT 1 CHECK (span > 0),
                        FOREIGN KEY (id) REFERENCES Building_Object(id)
);

CREATE TABLE House (
                       id int PRIMARY KEY,
                       floors int NOT NULL DEFAULT 1 CHECK (floors > 0),
                       FOREIGN KEY (id) REFERENCES Building_Object(id)
);

CREATE TABLE Work (
                      id SERIAL PRIMARY KEY,
                      name varchar NOT NULL,
                      object_ID int NOT NULL,
                      brigade_ID int NOT NULL,
                      planned_start date NOT NULL,
                      planned_finish date NOT NULL,
                      real_start date,
                      real_finish date,
                      FOREIGN KEY (object_ID) REFERENCES Building_Object(id),
                      FOREIGN KEY (brigade_ID) REFERENCES Brigade(id),
                      CHECK (planned_start < planned_finish AND real_start < real_finish)
);

CREATE TABLE Resource (
                          id SERIAL PRIMARY KEY,
                          name varchar NOT NULL,
                          measure varchar NOT NULL
);

CREATE TABLE Resource_At_Work (
                                work_ID int,
                                resource_ID int,
                                planned_Amount float4 NOT NULL,
                                used_Amount float4,
                                PRIMARY KEY (resource_ID, work_ID),
                                FOREIGN KEY (resource_ID) REFERENCES Resource(id),
                                FOREIGN KEY (work_ID) REFERENCES Work(id),
                                CHECK (planned_Amount > 0 AND used_Amount > 0)
);

CREATE TABLE Tech (
                      id SERIAL PRIMARY KEY,
                      name varchar NOT NULL,
                      management_ID int,
                      FOREIGN KEY (management_ID) REFERENCES Management(id)
);

CREATE TABLE Tech_At_Work (
                            work_ID int,
                            tech_ID int,
                            PRIMARY KEY (work_ID, tech_ID),
                            FOREIGN KEY (work_ID) REFERENCES Work(id),
                            FOREIGN KEY (tech_ID) REFERENCES Tech(id)
);