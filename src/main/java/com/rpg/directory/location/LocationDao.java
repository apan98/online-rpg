package com.rpg.directory.location;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDao extends Dao<Location> {
    public LocationDao(LocationRepository repository) {
        super(repository);
    }
}
