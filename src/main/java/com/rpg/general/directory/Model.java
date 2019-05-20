package com.rpg.general.directory;

import javax.persistence.*;

/**
 * Base object, for all object from {@link com.rpg.directory}
 */
@MappedSuperclass
public abstract class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}
