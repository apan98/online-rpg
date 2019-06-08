package com.rpg.directory.person;

import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import com.rpg.general.directory.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.person)
public class PersonController extends CrudApi<Person> {
    public PersonController(Crud<Person> crud) {
        super(crud);
    }
}