package com.rpg.directory.location.object;

import com.rpg.general.directory.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location_object")
public class LocationObject extends Model {

    public String name;

    public String description;

    @ManyToMany
    @JoinTable(name = "location_object_resource",
            joinColumns = { @JoinColumn(name = "location_object_id")},
            inverseJoinColumns = { @JoinColumn(name = "resource_id")})
    public List<LocationObjectResource> resources;

}