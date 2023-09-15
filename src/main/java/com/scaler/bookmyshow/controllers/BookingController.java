package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.Models.Booking;
import com.scaler.bookmyshow.dtos.BookingRequest;
import com.scaler.bookmyshow.services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookingController {
    private BookingService bookingService;

    @PostMapping("/booking")
    public Booking creatBooking(@RequestBody BookingRequest request){
        return bookingService.creatBooking(request);
    }


}
