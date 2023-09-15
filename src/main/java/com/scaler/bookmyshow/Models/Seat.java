package com.scaler.bookmyshow.Models;

import com.scaler.bookmyshow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Seat extends BaseModel {

   private Integer rowNo;
   private Integer colNo;

   @Enumerated
   private SeatType seatType;

   @ManyToOne
   @JoinColumn(name = "hall_id")
   private Hall hall;


}