package com.rpg.directory.location;

import com.rpg.directory.country.Country;
import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Location extends Model {

    public String name;

    public String description;

    @ManyToOne
    public Country country;

}