package com.example.survival_database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "prompts")
public class Message {

    @Id
    private Long id;
    private String message;

    public Message(){
       message = "";
    }

    public Message(Long id, String m){
        this.id = id;
        message = m;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
