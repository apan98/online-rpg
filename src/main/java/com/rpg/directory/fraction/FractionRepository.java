package com.rpg.directory.fraction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FractionRepository extends JpaRepository<Fraction, Long> {

}