package com.scaler.bookmyshow.dtos;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookingRequest {
    private Long userId;
    private Long showId;
    private List<Long> showSeatId = new ArrayList<>();

}
