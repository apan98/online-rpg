package com.rpg.directory.country;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao extends Dao<Country> {
    public CountryDao(CountryRepository repository) {
        super(repository);
    }
}
