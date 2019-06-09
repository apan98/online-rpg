package com.rpg.directory.resouce;

import com.rpg.directory.resouce.type.ResourceType;
import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Resource extends Model {

    public String name;

    public String description;

    public Long density; // плотность ресурса

    public Long rarity; // редкость этого ресурса в мире

    @ManyToOne
    public ResourceType type; // тип ресурса

}