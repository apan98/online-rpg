package com.rpg.directory.person;

import com.rpg.directory.person.character.PersonCharacter;
import com.rpg.directory.person.skill.PersonSkill;
import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Person extends Model {

    public String name;

    public LocalDate dateBirth;

    public String surname;

    public String lastName;

    @ManyToMany
    @JoinTable(name = "person_character",
            joinColumns = { @JoinColumn(name = "person_id")},
            inverseJoinColumns = { @JoinColumn(name = "character_id")})
    public List<PersonCharacter> personCharacters;

    @ManyToMany
    @JoinTable(name = "person_skill",
            joinColumns = { @JoinColumn(name = "person_id")},
            inverseJoinColumns = { @JoinColumn(name = "skill_id")})
    public List<PersonSkill> personSkills;

}