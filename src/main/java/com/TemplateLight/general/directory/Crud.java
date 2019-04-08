package com.TemplateLight.general.directory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface Crud<T extends Model> {

    T get(Long id);

    List<T> getAll();

    Page<T> getPage(PageRequest pageRequest);

    T create(T T);

    T update(T T);

}