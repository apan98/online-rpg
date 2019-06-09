package com.rpg.directory.location;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.location)
public class LocationController extends CrudApi<Location> {
    public LocationController(Crud<Location> crud) {
        super(crud);
    }
}