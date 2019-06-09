package com.rpg.directory.resouce;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDao extends Dao<Resource> {
    public ResourceDao(ResourceRepository repository) {
        super(repository);
    }
}
