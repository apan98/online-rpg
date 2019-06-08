package com.rpg.directory.person;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao extends Dao<Person> {
    public PersonDao(PersonRepository repository) {
        super(repository);
    }
}
