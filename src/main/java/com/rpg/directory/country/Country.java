package com.rpg.directory.country;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;

@Entity
public class Country extends Model {

    public String name;

    public String description;

}