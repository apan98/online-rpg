package com.rpg.directory.person;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Person extends Model {

    public String name;

    public LocalDate dateBirth;

    public String surname;

    public String lastName;

}