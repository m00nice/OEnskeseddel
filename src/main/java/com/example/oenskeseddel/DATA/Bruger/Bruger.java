package com.example.oenskeseddel.DATA.Bruger;

import javax.persistence.*;

@Entity
@Table(name = "brugerliste")

public class Bruger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Email;
    private String Username;
    private String Password;
    private String PasswordRE;
    private int id;

    public Bruger(String email, String username, String password, int id) {
        Email = email;
        Username = username;
        Password = password;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPasswordRE() {
        return PasswordRE;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPasswordRE(String passwordRE) {
        PasswordRE = passwordRE;
    }
}

