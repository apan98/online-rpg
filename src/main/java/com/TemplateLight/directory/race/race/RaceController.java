package com.TemplateLight.directory.race.race;

import com.TemplateLight.general.directory.Crud;
import com.TemplateLight.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/race")
public class RaceController extends CrudApi<Race> {
    public RaceController(Crud<Race> crud) {
        super(crud);
    }
}
