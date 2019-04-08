package com.TemplateLight.directory.character.person_base_character;

import com.TemplateLight.general.directory.Crud;
import com.TemplateLight.general.directory.CrudApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person/base-character")
public class PersonBaseCharacterController extends CrudApi<PersonBaseCharacter> {

    @Autowired
    public PersonBaseCharacterController(Crud<PersonBaseCharacter> crud) {
        super(crud);
    }

}
