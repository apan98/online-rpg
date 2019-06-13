insert into location_object (name, description) values ('Металический камень', 'маленький металический камень из свинца и железа');
INSERT INTO location_object_resource (location_object_id, resource_id, value) VALUES (1, 1, 300);
INSERT INTO location_object_resource (location_object_id, resource_id, value) VALUES (1, 2, 60);

insert into location_location_object (location_id, location_object_id) values (1, 1);