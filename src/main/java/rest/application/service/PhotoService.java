/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.service;

import org.springframework.stereotype.Service;
import rest.application.model.Photo;

/**
 *
 * @author Kamil
 */

public interface PhotoService {
     public Photo findById(Long id);
     public void add(Photo photo);
}
