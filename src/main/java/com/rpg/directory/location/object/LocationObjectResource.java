package com.rpg.directory.location.object;

import com.rpg.directory.resouce.Resource;
import com.rpg.general.directory.Model;

import javax.persistence.*;

@Entity
@Table(name = "location_object_resource")
public class LocationObjectResource extends Model {

//    @Column(name = "location_object_id")
//    public Long locationObjectId;

    @ManyToOne
    public Resource resource;

    public Long value;

}
