/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.application.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Kamil
 */

@Entity
@Table(name = "messagebox")
public class MessageBox implements Serializable {

    @Id
    @GeneratedValue
    private long id_messagebox;

    private String contents;

 
    @ManyToOne(optional=false)//(cascade = CascadeType.ALL)
    @JoinColumn(name="message_from",referencedColumnName = "id_account", nullable = false)
    private Account message_from;
   
   @ManyToOne(optional=false)//(cascade = CascadeType.ALL)
    @JoinColumn(name="message_to",referencedColumnName = "id_account", nullable = false)
    private Account message_to;
   

    @Column(name = "date_send")
    private java.util.Date dateSend;

    @Column(name = "date_view")
    private java.util.Date dateView;

    @Column(name = "message_read")
    private String messageRead;

    public MessageBox() {
    }

    public MessageBox(long id_messagebox, String contents, Account message_from, Account message_to, Date dateSend, Date dateView, String messageRead) {
        this.id_messagebox = id_messagebox;
        this.contents = contents;
        this.message_from = message_from;
        this.message_to = message_to;
        this.dateSend = dateSend;
        this.dateView = dateView;
        this.messageRead = messageRead;
    }
    

    public long getId_messagebox() {
        return id_messagebox;
    }

    public void setId_messagebox(long id_messagebox) {
        this.id_messagebox = id_messagebox;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Account getMessage_from() {
        return message_from;
    }

    public void setMessage_from(Account message_from) {
        this.message_from = message_from;
    }

    public Account getMessage_to() {
        return message_to;
    }

    public void setMessage_to(Account message_to) {
        this.message_to = message_to;
    }

    public Date getDateSend() {
        return dateSend;
    }

    public void setDateSend(Date dateSend) {
        this.dateSend = dateSend;
    }

    public Date getDateView() {
        return dateView;
    }

    public void setDateView(Date dateView) {
        this.dateView = dateView;
    }

    public String getMessageRead() {
        return messageRead;
    }

    public void setMessageRead(String messageRead) {
        this.messageRead = messageRead;
    }

    
    
}
