package com.rpg.directory.person.character;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;

@Entity
public class Character extends Model {

    public String name;

    public String description;

}