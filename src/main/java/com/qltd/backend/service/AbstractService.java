package com.qltd.backend.service;


import com.qltd.backend.utility.Paginator;
import lombok.Getter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public abstract class AbstractService<D, K extends Serializable, E> implements IAbstractService<D, K>{
    @Getter
    private JpaRepository<E, K> repository;


    @Getter
    protected Class<D> dtoClass;

    protected final Paginator<E, D> paginator;

    public AbstractService(JpaRepository<E, K> repository, Paginator<E, D> paginator) {
        this.repository = repository;
        this.paginator = paginator;
    }
}
