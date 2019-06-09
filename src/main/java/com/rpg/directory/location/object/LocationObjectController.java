package com.rpg.directory.location.object;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.Location.object)
public class LocationObjectController extends CrudApi<LocationObject> {
    public LocationObjectController(Crud<LocationObject> crud) {
        super(crud);
    }
}