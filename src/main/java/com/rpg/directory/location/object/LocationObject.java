package com.rpg.directory.location.object;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "location_object")
public class LocationObject extends Model {

    public String name;

    public String description;

}