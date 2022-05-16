INSERT INTO management VALUES
                           (1, 'United city'),
                           (2, 'Building Logic'),
                           (3, 'Brave New World'),
                           (4, 'Horizons');

INSERT INTO sector VALUES
                       (1, 'Concordia', 1),
                       (2, 'Moon Paellas', 1),
                       (3, 'Alts', 1),
                       (4, 'Kerberos', 2),
                       (5, 'Nadu Cache', 2),
                       (6, 'Notes', 2),
                       (7, 'Mab-on', 3),
                       (8, 'Rati Ourania', 3),
                       (9, 'Rhiannon', 3),
                       (10, 'Aina Amen', 4),
                       (11, 'Deerdre', 4),
                       (12, 'South Alla', 4);

INSERT INTO personnel VALUES
                          (1, 'Abraham Igor', 'Senior manager', 1),
                          (2, 'Mikhail Ulyanovsk', 'Concrete mixer controller', 1),
                          (3, 'Larsen Outset', 'Wrecking ball driver', 2),
                          (4, 'Alexandr Rochelle', 'Taxi driver', 2),
                          (5, 'Agata Antonina', 'Truck driver', 5),
                          (6, 'Elijah Devkit', 'Junior sector manager', 5),
                          (7, 'Vilde Cleisthenes', 'Management CEO', 6),
                          (8, 'Zdravko Jonas', 'HR manager', 6),
                          (9, 'Trinidad Lucile', 'HR manager', 8),
                          (10, 'Saturn Atef-eh', 'Middle manager', 9),
                          (11, 'Heimar Norman', 'Management CEO', 9),
                          (12, 'Amadeu Lucjan', 'Right hand', 11),
                          (13, 'Relay Levin', 'Homeless', 11),
                          (14, 'Pamphile Meike', 'Homeless', 11),
                          (15, 'Laura Stephani', 'Management founder', 12);

INSERT INTO sector_manager VALUES
                              (1),
                              (6),
                              (10),
                              (12);

INSERT INTO management_manager VALUES
                                  (1),
                                  (7),
                                  (11),
                                  (15);

INSERT INTO brigade VALUES
                        (1, 'Bechtel'),
                        (2, 'Flour Corporation'),
                        (3, 'Jacobs Engineering Group'),
                        (4, 'COMAE');

INSERT INTO worker VALUES
                       (1, 'Harrington Anzhelika', 4, 1),
                       (2, 'Stefania Mariya', 4, 1),
                       (3, 'Efrem Albert', 4, 1),
                       (4, 'Roman Avro', 8, 2),
                       (5, 'Mechanise Stanislav', 8, 2),
                       (6, 'Olga Path', 8, 2),
                       (7, 'Ruf Vadim', 9, 3),
                       (8, 'Avdotya Paraskevi', 9, 3),
                       (9, 'Innocente Ilari', 9, 3),
                       (10, 'Kir Nadia', 4, 4),
                       (11, 'Andrey Milo', 4, 4),
                       (12, 'Ferrante Nikolay', 4, 4);

INSERT INTO brigadier VALUES
                          (1),
                          (4),
                          (7),
                          (10);

INSERT INTO building_object VALUES
                               (1, 'NEW-BUILD-2.0', 'city administration', 1),
                               (2, 'Crimea Bridge', 'country administration', 2);

INSERT INTO house VALUES
    (1, 20);

INSERT INTO bridge VALUES
    (2, 100);

--date: 'YYYY-MM-DD'
-- plannedenddate - plannedstartdate + realstartdate
INSERT INTO work VALUES
                     (1, 'foundation', 1, 1, '22-03-2022', '20-04-2022', '22-03-2022', null),
                     (2, 'walls', 1, 3, '21-04-2022', '01-07-2022', '22-04-2022', null),
                     (3, 'floor', 1, 4, '01-07-2022', '29-07-2022', '03-07-2022', null),
                     (4, 'roof', 1, 4, '01-08-2022', '15-08-2022', null, null),
                     (5, 'finishing', 1, 2, '16-08-2022', '15-09-2022', null, null),

                     (6, 'site development', 2, 2, '01-01-2023', '10-01-2023', null, '11-01-2023'),
                     (7, 'building supports', 2, 2, '10-01-2023', '01-02-2023', null, '01-02-2023'),
                     (8, 'installation of superstructures', 2, 4, '01-02-2023', '15-04-2023', null, '15-04-2023'),
                     (9, 'liquidation of construction site', 2, 1, '06-04-2023', '11-04-2023', null, '12-04-2023');

INSERT INTO resource VALUES
                         (1, 'wood', 'kilo'),
                         (2, 'cement', 'kilo'),
                         (3, 'brick', 'pcs'),
                         (4, 'tile', 'pcs'),
                         (5, 'paint', 'liter'),
                         (6, 'iron', 'kilo');

INSERT INTO resource_at_work VALUES
                               (1, 1, 81, 80),
                               (1, 2, 44, 50),
                               (2, 1, 100, 100),
                               (2, 3, 10000, 10000),
                               (3, 1, 76, 70),
                               (4, 4, 37, 40),
                               (5, 5, 41, 50),
                               (6, 6, 100, 100),
                               (7, 6, 50, 50),
                               (7, 2, 64, 70),
                               (8, 1, 83, 80),
                               (8, 2, 120, 130),
                               (8, 6, 237, 240);

INSERT INTO Tech VALUES
                     (1, 'concrete mixer', 1),
                     (2, 'wrecking ball', 2),
                     (3, 'crane', 3);

INSERT INTO tech_at_work VALUES
                           (1, 1),
                           (4, 3),
                           (7, 1),
                           (7, 3),
                           (8, 1),
                           (8, 3),
                           (9, 2);