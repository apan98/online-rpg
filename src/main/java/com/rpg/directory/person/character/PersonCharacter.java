package com.rpg.directory.person.character;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_character")
public class PersonCharacter extends Model {

//    @Column(name = "person_id")
//    public Long person;

    @ManyToOne
    public Character character;

    public Long value;

}
