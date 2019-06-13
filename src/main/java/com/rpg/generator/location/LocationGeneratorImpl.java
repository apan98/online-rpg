package com.rpg.generator.location;

import com.rpg.directory.fraction.FractionDao;
import com.rpg.directory.location.Location;
import com.rpg.directory.location.LocationDao;
import com.rpg.directory.location.object.LocationObject;
import com.rpg.directory.location.object.LocationObjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LocationGeneratorImpl implements LocationGenerator {
    private LocationDao locationDao;
    private LocationObjectDao locationObjectDao;
    private FractionDao fractionDao;
    private Random random = new Random();


    @Autowired
    public LocationGeneratorImpl(LocationDao locationDao, LocationObjectDao locationObjectDao, FractionDao fractionDao) {
        this.locationDao = locationDao;
        this.locationObjectDao = locationObjectDao;
        this.fractionDao = fractionDao;
    }

    @Override
    public void generate(GenerateLocationRequest generateLocationRequest) {
        int size = locationObjectDao.getAll().size();
        Location location = new Location();
        List<LocationObject> locationObjects = new ArrayList<>();
        for (int i = 0; i < generateLocationRequest.numberOfObject; i++) {
            Long randomValue = (long) random.nextInt(size);
            if(randomValue.equals(0L)) {
                randomValue = 1L;
            }
            locationObjects.add(locationObjectDao.get(randomValue));
        }
        location.locationObjects = locationObjects;
        location.name = generateLocationRequest.name;
        location.description = generateLocationRequest.description;
        location.fraction = fractionDao.get(generateLocationRequest.fraction);
        locationDao.create(location);
    }
}
