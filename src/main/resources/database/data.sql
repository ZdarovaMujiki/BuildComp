INSERT INTO management(name) VALUES
                           ('United city'),
                           ('Building Logic'),
                           ('Brave New World'),
                           ('Horizons');

INSERT INTO sector(name, management_id) VALUES
                       ('Concordia', 1),
                       ('Moon Paellas', 1),
                       ('Alts', 1),
                       ('Kerberos', 2),
                       ('Nadu Cache', 2),
                       ('Notes', 2),
                       ('Mab-on', 3),
                       ('Rati Ourania', 3),
                       ('Rhiannon', 3),
                       ('Aina Amen', 4),
                       ('Deerdre', 4),
                       ('South Alla', 4);

INSERT INTO personnel(name, duty, sector_id) VALUES
                          ('Abraham Igor', 'Senior manager', 1),
                          ('Mikhail Ulyanovsk', 'Concrete mixer controller', 1),
                          ('Larsen Outset', 'Wrecking ball driver', 2),
                          ('Alexandr Rochelle', 'Taxi driver', 2),
                          ('Agata Antonina', 'Truck driver', 5),
                          ('Elijah Devkit', 'Junior sector manager', 5),
                          ('Vilde Cleisthenes', 'Management CEO', 6),
                          ('Zdravko Jonas', 'HR manager', 6),
                          ('Trinidad Lucile', 'HR manager', 8),
                          ('Saturn Atef-eh', 'Middle manager', 9),
                          ('Heimar Norman', 'Management CEO', 9),
                          ('Amadeu Lucjan', 'Right hand', 11),
                          ('Relay Levin', 'Homeless', 11),
                          ('Pamphile Meike', 'Homeless', 11),
                          ('Laura Stephani', 'Management founder', 12);

INSERT INTO sector_manager(id) VALUES
                              (1),
                              (6),
                              (10),
                              (12);

INSERT INTO management_manager(id) VALUES
                                  (1),
                                  (7),
                                  (11),
                                  (15);

INSERT INTO brigade(name) VALUES
                        ('Bechtel'),
                        ('Flour Corporation'),
                        ('Jacobs Engineering Group'),
                        ('COMAE');

INSERT INTO worker(name, sector_id, brigade_id) VALUES
                       ('Harrington Anzhelika', 4, 1),
                       ('Stefania Mariya', 4, 1),
                       ('Efrem Albert', 4, 1),
                       ('Roman Avro', 8, 2),
                       ('Mechanise Stanislav', 8, 2),
                       ('Olga Path', 8, 2),
                       ('Ruf Vadim', 9, 3),
                       ('Avdotya Paraskevi', 9, 3),
                       ('Innocente Ilari', 9, 3),
                       ('Kir Nadia', 4, 4),
                       ('Andrey Milo', 4, 4),
                       ('Ferrante Nikolay', 4, 4);

INSERT INTO brigadier(id) VALUES
                          (1),
                          (4),
                          (7),
                          (10);

INSERT INTO building_object(name, client, sector_id) VALUES
                               ('NEW-BUILD-2.0', 'city administration', 1),
                               ('Crimea Bridge', 'country administration', 2);

INSERT INTO house(id, floors) VALUES
    (1, 20);

INSERT INTO bridge(id, span) VALUES
    (2, 100);

--date: 'YYYY-MM-DD'
-- plannedenddate - plannedstartdate + realstartdate
INSERT INTO work(name, object_id, brigade_id, planned_start, planned_finish, real_start, real_finish) VALUES
                     ('foundation', 1, 1, '22-03-2022', '20-04-2022', '22-03-2022', null),
                     ('walls', 1, 3, '21-04-2022', '01-07-2022', '22-04-2022', null),
                     ('floor', 1, 4, '01-07-2022', '29-07-2022', '03-07-2022', null),
                     ('roof', 1, 4, '01-08-2022', '15-08-2022', null, null),
                     ('finishing', 1, 2, '16-08-2022', '15-09-2022', null, null),

                     ('site development', 2, 2, '01-01-2023', '10-01-2023', null, '11-01-2023'),
                     ('building supports', 2, 2, '10-01-2023', '01-02-2023', null, '01-02-2023'),
                     ('installation of superstructures', 2, 4, '01-02-2023', '15-04-2023', null, '15-04-2023'),
                     ('liquidation of construction site', 2, 1, '06-04-2023', '11-04-2023', null, '12-04-2023');

INSERT INTO resource(name, measure) VALUES
                         ('wood', 'kilo'),
                         ('cement', 'kilo'),
                         ('brick', 'pcs'),
                         ('tile', 'pcs'),
                         ('paint', 'liter'),
                         ('iron', 'kilo');

INSERT INTO resource_at_work(work_id, resource_id, planned_amount, used_amount) VALUES
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

INSERT INTO Tech(name, management_id) VALUES
                     ('concrete mixer', 1),
                     ('wrecking ball', 2),
                     ('crane', 3);

INSERT INTO tech_at_work(work_id, tech_id) VALUES
                           (1, 1),
                           (4, 3),
                           (7, 1),
                           (7, 3),
                           (8, 1),
                           (8, 3),
                           (9, 2);