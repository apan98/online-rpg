package com.rpg.directory.biography;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class BiographyDao extends Dao<Biography> {
    public BiographyDao(BiographyRepository repository) {
        super(repository);
    }
}
