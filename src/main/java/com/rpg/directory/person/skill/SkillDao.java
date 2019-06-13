package com.rpg.directory.person.skill;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class SkillDao extends Dao<Skill> {
    public SkillDao(SkillRepository repository) {
        super(repository);
    }
}
