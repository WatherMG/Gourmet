package com.braincraftapps.gourmet.data;

import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public interface IDatasource<E> {

    E create(E entry);

    int update(E entry);

    List<E> findAll();

    List<E> findFiltered(String selection, String orderBy);

    E findById(long id);

    boolean remove(long id);
}
