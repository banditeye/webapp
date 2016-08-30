/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rest.application.model.Account;

/**
 *
 * @author Komputer
 */
@Repository
public interface AccountDao extends JpaRepository<Account, Serializable>{
        Account findByEmailLike(String email);
}
