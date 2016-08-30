/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rest.application.model.Account;
import rest.application.model.UserObserved;

/**
 *
 * @author Komputer
 */
public interface UserObservedDao extends JpaRepository<UserObserved, Serializable> {
 
 List <UserObserved> findByAccount1(Account account);
    
}
