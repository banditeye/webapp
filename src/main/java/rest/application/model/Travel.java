/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Kamil
 */
@Entity
@Table(name = "travel")
public class Travel implements Serializable {
    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id_travel;
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    private String titile;
    
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    @Column(name = "starting_place")
    private String startingPlace;
    
     @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z-zżźćńółęąśŻŹĆĄŚĘŁÓŃ ]*", message = "must contain only letters and spaces")
    private String destination;
    
    
    @Column(name = "date_from")
    private java.util.Date dateFrom;
   
    
    @Column(name = "date_to")
    private java.util.Date dateTo;
    

    
    private String description;
    
    @Lob
    @Column( name = "main_photo" )
    private byte[] mainPhoto;
    
    @Column(name = "date_added")
    private java.util.Date dateAdded;

    public Travel() {
    }

    
    
    
}
