package com.scaler.bookmyshow.Models;

import com.scaler.bookmyshow.Enums.BookingStatus;
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
public class Booking extends BaseModel {
    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> seats= new ArrayList<>();

    private Double amount;

    private Date bookedAt;

    @Enumerated
    private BookingStatus status;

    @OneToMany
    private  List<Payment> payments= new ArrayList<>();



}