package com.rpg.directory.biography;

import com.rpg.directory.fraction.Fraction;
import com.rpg.directory.person.Person;
import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Biography extends Model {

    public String description;

    @ManyToOne
    public Person person;

    @ManyToOne
    public Fraction fraction;
}