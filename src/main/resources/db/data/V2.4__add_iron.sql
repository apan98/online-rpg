INSERT INTO resource_type (name, description)
VALUES ('Металлы', 'Металы прочные материалы хорошо пригодные для создания инструментов');

INSERT INTO resource (name, description, density, rarity, type_id)
VALUES ('железо', 'Один из самых распространненых металов', 200, 20, 1);

INSERT INTO rpg.location (name, description, country_id)
VALUES ('Лесок', 'Небольшой лес', 1);
INSERT INTO rpg.location (name, description, country_id)
VALUES ('Деревня Рори', 'Небольшая деревня', 1);