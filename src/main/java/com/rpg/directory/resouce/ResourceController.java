package com.rpg.directory.resouce;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.resource)
public class ResourceController extends CrudApi<Resource> {
    public ResourceController(Crud<Resource> crud) {
        super(crud);
    }
}