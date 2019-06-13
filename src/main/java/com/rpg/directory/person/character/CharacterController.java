package com.rpg.directory.person.character;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.Person.character)
public class CharacterController extends CrudApi<Character> {
    public CharacterController(Crud<Character> crud) {
        super(crud);
    }
}