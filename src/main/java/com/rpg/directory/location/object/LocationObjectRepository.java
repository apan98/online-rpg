package com.rpg.directory.location.object;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationObjectRepository extends JpaRepository<LocationObject, Long> {

}