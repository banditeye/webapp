/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Kamil
 */
@Entity
@Table(name="userobserved")
public class UserObserved implements Serializable{
    @Id
    @GeneratedValue
    private Long id_userobserved;
    
    @ManyToOne(optional=false)//(cascade = CascadeType.ALL)
    @JoinColumn(name="account1",referencedColumnName = "id_account", nullable = false)
    private Account account1;
    
    
    @ManyToOne(optional=false)//(cascade = CascadeType.ALL)
    @JoinColumn(name="account2",referencedColumnName = "id_account",nullable = false)
    private Account account2;


    public UserObserved() {
    }

    public UserObserved(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public Account getAccount1() {
        return account1;
    }

    public Account getAccount2() {
        return account2;
    }
    
    
    
    




   



    

  
    
    
}
