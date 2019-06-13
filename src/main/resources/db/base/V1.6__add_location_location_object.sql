create table location_location_object (
  location_id bigint references location(id),
  location_object_id bigint references location_object(id)
);