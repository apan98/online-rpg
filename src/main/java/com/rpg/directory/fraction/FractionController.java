package com.rpg.directory.fraction;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.fraction)
public class FractionController extends CrudApi<Fraction> {
    public FractionController(Crud<Fraction> crud) {
        super(crud);
    }
}