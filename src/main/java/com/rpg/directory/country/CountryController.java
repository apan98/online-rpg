package com.rpg.directory.country;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.country)
public class CountryController extends CrudApi<Country> {
    public CountryController(Crud<Country> crud) {
        super(crud);
    }
}