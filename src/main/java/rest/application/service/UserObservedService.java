/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.service;

import java.util.List;
import rest.application.model.UserObserved;

/**
 *
 * @author Kamil
 */

public interface UserObservedService {
    public List<UserObserved> whoObservedById(Long id);
    public void saveObserved(Long id1,Long id2);  
    public void saveObserved(UserObserved observed);  
     List<UserObserved> getAllObserved();
    
}
