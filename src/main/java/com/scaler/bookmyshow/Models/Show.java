package com.scaler.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="shows")
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;


    private Date startTime;
    private Integer duration;

    @ManyToOne
    private Threatre threatre;

    @OneToMany
    private List<ShowSeat> showseats= new ArrayList<>();

}