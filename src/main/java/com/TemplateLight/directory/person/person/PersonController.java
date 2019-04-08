package com.TemplateLight.directory.person.person;

import com.TemplateLight.general.directory.Crud;
import com.TemplateLight.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController extends CrudApi<Person> {
    public PersonController(Crud<Person> crud) {
        super(crud);
    }
}
