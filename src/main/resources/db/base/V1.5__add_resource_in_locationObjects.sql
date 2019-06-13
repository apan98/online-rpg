create table location_object_resource (
    id bigserial not null primary key,
    location_object_id bigint not null references location_object(id),
    resource_id bigint not null references resource(id),
    value bigint not null
);