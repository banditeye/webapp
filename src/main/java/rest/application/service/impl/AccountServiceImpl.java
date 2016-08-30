


package rest.application.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;



import org.springframework.stereotype.Service;
import rest.application.model.Account;
import rest.application.dao.AccountDao;
import rest.application.service.AccountService;
import static org.springframework.util.Assert.notNull;

/**
 *
 * @author Komputer
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;
 

    @Override
    public void createAccount(Account account) {
        accountDao.save(account);
    }

    @Override
    public List<Account> getAllAccount() {
        return (List<Account>) accountDao.findAll();
    }

    @Override
    public Account getAccountByEmail(String email) {
         return accountDao.findByEmailLike(email);
    }

    @Override
    public Account getAccount(Long id) {
       return accountDao.findOne(id);
    }

    @Override
    public void updateAccount(Account account) {
      Account account1=accountDao.findOne(account.getId_account());
      account1.setCity(account.getCity());
      
      
      
    }

    @Override
    public void deleteAccount(Long id) {
     accountDao.delete(id);
        
    }
    
  

   
}
