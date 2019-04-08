package com.TemplateLight.directory.person.person;

import com.TemplateLight.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao extends Dao<Person> {
    public PersonDao(PersonRepository jpaRepository) {
        super(jpaRepository);
    }
}
