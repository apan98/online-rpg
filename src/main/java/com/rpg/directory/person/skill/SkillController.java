package com.rpg.directory.person.skill;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.Person.skill)
public class SkillController extends CrudApi<Skill> {
    public SkillController(Crud<Skill> crud) {
        super(crud);
    }
}