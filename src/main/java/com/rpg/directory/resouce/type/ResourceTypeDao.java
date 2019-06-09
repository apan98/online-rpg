package com.rpg.directory.resouce.type;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceTypeDao extends Dao<ResourceType> {
    public ResourceTypeDao(ResourceTypeRepository repository) {
        super(repository);
    }
}
