package com.rpg.directory.resouce.type;

import com.rpg.general.directory.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resource_type")
public class ResourceType extends Model {

    public String name;

    public String description;

}