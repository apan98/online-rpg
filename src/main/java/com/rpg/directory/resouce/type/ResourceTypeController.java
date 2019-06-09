package com.rpg.directory.resouce.type;

import com.rpg.general.directory.Api;
import com.rpg.general.directory.Crud;
import com.rpg.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.Resource.type)
public class ResourceTypeController extends CrudApi<ResourceType> {
    public ResourceTypeController(Crud<ResourceType> crud) {
        super(crud);
    }
}