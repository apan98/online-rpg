package com.TemplateLight.general.directory;

import javax.persistence.*;

@MappedSuperclass
public abstract class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}
