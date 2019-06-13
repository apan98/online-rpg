package com.rpg.directory.location;

import com.rpg.directory.fraction.Fraction;
import com.rpg.directory.location.object.LocationObject;
import com.rpg.general.directory.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location extends Model {

    public String name;

    public String description;

    @ManyToOne
    public Fraction fraction;

    @ManyToMany
    @JoinTable(name = "location_location_object",
            joinColumns = { @JoinColumn(name = "location_id")},
            inverseJoinColumns = { @JoinColumn(name = "location_object_id")})
    public List<LocationObject> locationObjects;

}