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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import rest.application.model.UserObserved;
import rest.application.service.UserObservedService;

/**
 *
 * @author Kamil
 */
@Controller
@RequestMapping("/userobserved")
public class UserObservedRestController {
    @Autowired
    UserObservedService userObservedService;
    
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ResponseBody List<UserObserved> findObservedUser(@PathVariable Long id) {
        
        return userObservedService.whoObservedById(id); 
    }
    
     @RequestMapping(value = "/add/{id1}/{id2}", method = RequestMethod.PUT)
    public void addObserved(@PathVariable Long id1, @PathVariable Long id2) {
        userObservedService.saveObserved(id1, id2);
    }
    
    
    
        @RequestMapping(method = RequestMethod.POST)
        public void createUser(@RequestBody UserObserved userObserved) {
        userObservedService.saveObserved(userObserved);

    }
     
     
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<UserObserved> studentList() {
        return userObservedService.getAllObserved();
    }
    
    
}
