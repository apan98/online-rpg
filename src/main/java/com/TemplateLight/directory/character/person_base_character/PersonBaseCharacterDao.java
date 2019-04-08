package com.TemplateLight.directory.character.person_base_character;

import com.TemplateLight.general.directory.Dao;
import org.springframework.stereotype.Repository;


@Repository
public class PersonBaseCharacterDao extends Dao<PersonBaseCharacter> {
    public PersonBaseCharacterDao(PersonBaseCharacterRepository personBaseCharacterRepository) {
        super(personBaseCharacterRepository);
    }

}
