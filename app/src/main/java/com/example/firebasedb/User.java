package com.example.firebasedb;

public class User {
    public String id, name, sacname, email;


     User() {
    }


    public User(String id, String name, String sacname, String email) {
        this.id = id;
        this.name = name;
        this.sacname = sacname;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSacname() {
        return sacname;
    }

    public void setSacname(String sacname) {
        this.sacname = sacname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
