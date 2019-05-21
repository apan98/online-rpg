package com.rpg.general.directory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * generic Crud inteface for base operation create, update, delete, get page, get all, get by id
 * @param <T> model, entity {@link Model}
 */
public interface Crud<T extends Model> {

    T get(Long id);

    List<T> getAll();

    Page<T> getPage(PageRequest pageRequest);

    T create(T model);

    T update(T model);

}