package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User extends BaseModel {

    private String name;
    private String email;

    private String password;

    public User(String name,String email,String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }
}
