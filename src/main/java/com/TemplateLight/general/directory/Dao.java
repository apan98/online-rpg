package com.TemplateLight.general.directory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public abstract class Dao<T extends Model> implements Crud<T>{
    JpaRepository<T, Long> jpaRepository;

    public Dao(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public T get(Long id) {
        return jpaRepository.getOne(id);
    }

    @Override
    public List<T> getAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Page<T> getPage(PageRequest pageRequest) {
        return jpaRepository.findAll(pageRequest);
    }

    @Override
    public T create(T t) {
        if(t.id != null) {
            throw new IllegalStateException("id must be null!");
        }
        return jpaRepository.save(t);
    }

    @Override
    public T update(T t) {
        if(t.id == null) {
            throw new IllegalStateException("id must not be null!");
        }
        return jpaRepository.save(t);
    }
}
