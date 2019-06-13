package com.rpg.directory.person.character;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterDao extends Dao<Character> {
    public CharacterDao(CharacterRepository repository) {
        super(repository);
    }
}
