package com.rpg.directory.race.race;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class RaceDao extends Dao<Race> {
    public RaceDao(RaceRepository repository) {
        super(repository);
    }
}
