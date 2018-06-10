package com.qltd.backend.service;

import com.qltd.backend.dto.Pager;
import java.io.Serializable;

public interface IAbstractService<D, K extends Serializable> {

    Pager<D> loadAll(int currentPage, int noOfRowInPage, String sortBy, String direction);

    D getOneByKey(K key) throws Exception;

    D add(D object) throws Exception;

    D edit(D object) throws Exception;

    D delete(K key) throws Exception;
}
