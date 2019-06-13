package com.rpg.generator.location;

import com.rpg.general.directory.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.Location.generate)
public class LocationGeneratorController {

    @Autowired
    private LocationGenerator locationGenerator;

    @PostMapping
    public void generate(@RequestBody GenerateLocationRequest generateLocationRequest) {
        locationGenerator.generate(generateLocationRequest);
    }
}
