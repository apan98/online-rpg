package com.rpg.directory.person.skill;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;

@Entity
public class Skill extends Model {

    public String name;

    public String description;

}