/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Komputer
 * @param <T>
 */
@Transactional
public abstract class AbstractDao<T extends Object> implements CrudRepository<T, Serializable> {

    @Autowired
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    private Class<T> domainClass;

    @SuppressWarnings("unchecked")
    private Class<T> getDomainClass() {
        if (domainClass == null) {
            ParameterizedType thisType
                    = (ParameterizedType) getClass().getGenericSuperclass();
            this.domainClass
                    = (Class<T>) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    private String getDomainClassName() {
        return getDomainClass().getName();
    }

}
