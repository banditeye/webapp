/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rest.application.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account implements Serializable {
    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;
    
 
    @Id
    @GeneratedValue
    private Long id_account;


    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    private String name;


    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only lettersand spaces")
    private String surname;

    @NotNull
    @Pattern(regexp = "[A-Za-z-0-9]*", message = "must contain only letters, spaces and number")
    @NotEmpty(message = "Login address cannot be empty")
    private String login;


    @NotNull
    @NotEmpty(message = "Email address cannot be empty")
    @Email(message = "Invalid email address, e.g. valid email address: example@gmail.com")
    private String email;

    @Size(min = 2, max = 3)
    @Digits(fraction = 0, integer = 3, message = "Incorrect Format, valid e.g. 212")
    @Column(name = "phone_prefix")
    private String phone_prefix;

    @Size(min = 9, max = 9)
    @Digits(fraction = 0, integer = 9, message = "Incorrect Format, valid e.g. 212121212")
    @Column(name = "phone_number")
    private String phone_number;


    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    @Column(name = "city")
    private String city;


    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    @Column(name = "street")
    private String street;


    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "home_number")
    private String home_number;

    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "postal_code")
    private String postal_code;

    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "postal_city")
    private String postal_city;

    

    
    public Account() {
    }

    public Account(Long id_account, String name, String surname, String login, String email, String phone_prefix, String phone_number, String city, String street, String home_number, String postal_code, String postal_city) {
        this.id_account = id_account;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.email = email;
        this.phone_prefix = phone_prefix;
        this.phone_number = phone_number;
        this.city = city;
        this.street = street;
        this.home_number = home_number;
        this.postal_code = postal_code;
        this.postal_city = postal_city;
    }
    

    

    public Long getId_account() {
        return id_account;
    }

    public void setId_users(Long id_account) {
        this.id_account = id_account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_prefix() {
        return phone_prefix;
    }

    public void setPhone_prefix(String phone_prefix) {
        this.phone_prefix = phone_prefix;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome_number() {
        return home_number;
    }

    public void setHome_number(String home_number) {
        this.home_number = home_number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPostal_city() {
        return postal_city;
    }

    public void setPostal_city(String postal_city) {
        this.postal_city = postal_city;
    }


    
    
    
}
