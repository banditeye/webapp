/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Komputer
 * @param <T>
 */
public interface Dao<T extends Object> {

    void create(T t);
    T get(Serializable id);
    T load(Serializable id);
    List<T> getAll();
    void update(T t);
    void delete(T t);
    void deleteById(Serializable id);
    void deleteAll();
    long count();
    boolean exists(Serializable id);

}
