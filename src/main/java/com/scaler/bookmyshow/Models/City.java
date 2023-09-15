package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity

public class City extends BaseModel {
    private String name;
    @OneToMany
    private List<Threatre> threatres=new ArrayList<>();
}