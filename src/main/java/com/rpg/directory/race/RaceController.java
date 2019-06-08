package com.rpg.directory.race;

import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import com.rpg.general.directory.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.race)
public class RaceController extends CrudApi<Race> {
    public RaceController(Crud<Race> crud) {
        super(crud);
    }
}