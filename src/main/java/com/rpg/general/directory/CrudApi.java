package com.rpg.general.directory;

import lombok.NonNull;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;

/**
 * Generic api for base operation create, update, delete, get by id, get all, get page
 * @param <T> model, entity {@link Model}
 */
@MappedSuperclass
public abstract class CrudApi<T extends Model> {

    private Crud<T> crud;

    public CrudApi(Crud<T> crud) {
        this.crud = crud;
    }

    @GetMapping("/{id}")
    T get(@PathVariable Long id) {
        return crud.get(id);
    }

    @GetMapping
    Object get(@RequestParam(required = false) PageRequest pageRequest) {
        if(pageRequest == null) {
            return crud.getAll();
        }
        return crud.getPage(pageRequest);
    }

    @PostMapping
    T create(@RequestBody @NonNull @Validated T model) {
        return crud.create(model);
    }

    @PutMapping
    T update(@RequestBody @NonNull @Validated T model) {
        return crud.update(model);
    }
}
