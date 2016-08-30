/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.application.dao.PhotoDao;
import rest.application.model.Photo;
import rest.application.service.PhotoService;

/**
 *
 * @author Kamil
 */
@Service
@Transactional
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotoDao photoDao;
    
    @Override
    public Photo findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Photo photo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    
}
