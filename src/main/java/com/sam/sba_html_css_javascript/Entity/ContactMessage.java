package com.sam.sba_html_css_javascript.Entity;



import jakarta.persistence.*;

@Entity
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String email;
    private String message;

    // Getters and setters
    // ...


    public ContactMessage() {
    }

    public ContactMessage(String fullname, String email,  String message) {
        this.fullname = fullname;
        this.email = email;
        this.message = message;
    }

    public ContactMessage(Long id, String fullname, String email, String message) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.message = message;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactMessage{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

