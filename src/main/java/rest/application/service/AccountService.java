package rest.application.service;

import java.util.List;
import rest.application.model.Account;


public interface AccountService {

    void createAccount(Account account);

    List<Account> getAllAccount();

    Account getAccountByEmail(String email);

    Account getAccount(Long id);

    void updateAccount(Account account);

    void deleteAccount(Long id);

}
