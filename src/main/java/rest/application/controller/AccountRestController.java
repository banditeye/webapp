/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;
import rest.application.model.Account;
import rest.application.service.AccountService;

/**
 *
 * @author Komputer
 */
@Controller
@RequestMapping("/account")
public class AccountRestController {


    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Account> accountList() { return accountService.getAllAccount();}
    

    
  @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Account getAccountById(@PathVariable("id") Long id) {
        return accountService.getAccount(id);
    }
    
    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Account getAccountById(@PathVariable("email") String email) {
        return accountService.getAccountByEmail(email);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Account user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getName());

        //if (userDao.isUserExist(user)) {
        //  System.out.println("A User with name " + user.getName() + " already exist");
        //return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        //}
        accountService.createAccount(user);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/add/{id}").buildAndExpand(user.getId_account()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

 
    

    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String cos() {
        return "error";
    }

}
