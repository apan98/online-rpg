package com.TemplateLight.directory.race.race;

import com.TemplateLight.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class RaceDao extends Dao<Race> {
    public RaceDao(RaceRepository jpaRepository) {
        super(jpaRepository);
    }
}
