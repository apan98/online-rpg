package com.rpg.directory.resouce.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceTypeRepository extends JpaRepository<ResourceType, Long> {

}