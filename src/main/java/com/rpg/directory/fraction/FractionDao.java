package com.rpg.directory.fraction;

import com.rpg.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class FractionDao extends Dao<Fraction> {
    public FractionDao(FractionRepository repository) {
        super(repository);
    }
}
