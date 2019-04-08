package com.TemplateLight.directory.character.person_base_character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonBaseCharacterRepository extends JpaRepository<PersonBaseCharacter, Long> {
}
