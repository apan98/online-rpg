package com.rpg.general.directory;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;

/**
 * Generic api for base operation create, update, delete, get by id, get all, get page
 *
 * @param <T> model, entity {@link Model}
 */
@MappedSuperclass
public abstract class CrudApi<T extends Model> {
    private static final String TOTAL = "X-Total-Count";

    private Crud<T> crud;

    public CrudApi(Crud<T> crud) {
        this.crud = crud;
    }

    @GetMapping("/{id}")
    ResponseEntity<T> get(@PathVariable Long id) {
        return new ResponseEntity<>(crud.get(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<T>> get(@RequestParam(required = false) PageRequest pageRequest) {
        List<T> response;
        HttpHeaders headers = new HttpHeaders();
        if (pageRequest == null) {
            response = crud.getAll();
        } else {
            Page<T> page = crud.getPage(pageRequest);
            response = page.getContent();
            headers.add(TOTAL, String.valueOf(page.getTotalElements()));
        }
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
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
