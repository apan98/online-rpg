package com.rpg.directory.location.object;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class LocationObjectDao extends Dao<LocationObject> {
    public LocationObjectDao(LocationObjectRepository repository) {
        super(repository);
    }
}
