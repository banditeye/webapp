/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import rest.application.model.Account;

/**
 *
 * @author Komputer
 * @param <T>
 */

@Transactional
public class ClassDao<T extends Object> implements CrudRepository<T, Serializable> {

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

    @Override
    public <S extends T> S save(S s) {
         getEm().persist(s);
         return s;
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findOne(Serializable id) {
        return (T) getEm().find(getDomainClass(),id);
    }
    
    public T load(Serializable id)
    {
        return (T) getEm().getReference(getDomainClass(), id);
    }

    @Override
    public boolean exists(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<T> findAll(Iterable<Serializable> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Iterable<? extends T> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
