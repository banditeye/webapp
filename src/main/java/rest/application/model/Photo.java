/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Kamil
 */

@Entity
@Table(name = "photo")
public class Photo implements Serializable {
    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id_user;
    
    @Lob
    @Column( name = "main_photo" )
    private byte[] mainPhoto;

    public Photo() {
    }

    public Photo(Long id_user, byte[] mainPhoto) {
        this.id_user = id_user;
        this.mainPhoto = mainPhoto;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public byte[] getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(byte[] mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public Photo(byte[] mainPhoto) {
        this.mainPhoto = mainPhoto;
    }
    
    
    
    
}
