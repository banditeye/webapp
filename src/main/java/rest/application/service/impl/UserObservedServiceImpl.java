/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.application.dao.AccountDao;
import rest.application.model.UserObserved;
import rest.application.service.UserObservedService;
import rest.application.dao.UserObservedDao;
import rest.application.model.Account;

/**
 *
 * @author Kamil
 */
@Service
@Transactional
public class UserObservedServiceImpl implements UserObservedService {
    @Autowired
    private UserObservedDao userObservedDao;
    
    @Autowired
    private AccountDao accountDao;
    
  

    
    @Override
    public List<UserObserved> whoObservedById(Long id) {
        Account account=accountDao.findOne(id);
        return userObservedDao.findByAccount1(account);
    }

 

    @Override
    public List<UserObserved> getAllObserved() {
        return (List<UserObserved>) userObservedDao.findAll();
    }

    @Override
    public void saveObserved(Long id1, Long id2) {
        Account account1=accountDao.findOne(id1);
        Account account2=accountDao.findOne(id2);
        UserObserved observed=new UserObserved(account1, account2);
        userObservedDao.save(observed);
        
    }

    @Override
    public void saveObserved(UserObserved observed) {
     
    }

 

}
