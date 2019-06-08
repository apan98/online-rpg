package com.rpg.directory.biography;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.biography)
public class BiographyController extends CrudApi<Biography> {
    public BiographyController(Crud<Biography> crud) {
        super(crud);
    }
}