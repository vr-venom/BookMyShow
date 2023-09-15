package com.scaler.bookmyshow.Models;

import com.scaler.bookmyshow.Enums.seatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ShowSeat extends BaseModel {
//     @ManyToOne
//   private Show show;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated
    private seatStatus status;

}