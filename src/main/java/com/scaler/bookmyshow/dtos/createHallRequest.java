package com.scaler.bookmyshow.dtos;

import com.scaler.bookmyshow.Enums.MovieFeatures;
import com.scaler.bookmyshow.Enums.SeatType;
import com.scaler.bookmyshow.Models.Seat;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class createHallRequest {
    private String name;
    private List<MovieFeatures> features = new ArrayList<>();
    private Map<SeatType,List<SeatPosition>> seatRang = new HashMap<>();
}
