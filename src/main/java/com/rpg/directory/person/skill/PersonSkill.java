package com.rpg.directory.person.skill;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_skill")
public class PersonSkill extends Model {

//    @Column(name = "person_id")
//    public Long person;

    @ManyToOne
    public Skill skill;

    public Long value;

}
