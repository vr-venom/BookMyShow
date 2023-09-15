package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.Enums.BookingStatus;
import com.scaler.bookmyshow.Enums.seatStatus;
import com.scaler.bookmyshow.Models.Booking;
import com.scaler.bookmyshow.Models.Show;
import com.scaler.bookmyshow.Models.ShowSeat;
import com.scaler.bookmyshow.Models.User;
import com.scaler.bookmyshow.dtos.BookingRequest;
import com.scaler.bookmyshow.repositories.BookingRepository;
import com.scaler.bookmyshow.repositories.ShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class BookingService {

    private UserService userService;
    private ShowServices showServices;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;
    public Booking creatBooking(BookingRequest request) {
        User user = userService.getUserInternal(request.getUserId());
        if (user==null){
            throw new NoSuchElementException("Invalid User ID :" + request.getUserId());
        }
        Show show = showServices.getShow(request.getShowId());
        List<ShowSeat> seats = showSeatRepository.findAllById(request.getShowSeatId());
        for(ShowSeat s:seats ){
            if(s.getStatus()!= seatStatus.AVAILABLE){
                throw new InvalidParameterException("Seat khali ni h ");
            }
        }
        for(ShowSeat s:seats ){
            s.setStatus(seatStatus.LOCKED);
        }
        List<ShowSeat> savedSeat = showSeatRepository.saveAll(seats);
        Double amount = null;
        Booking booking = Booking.builder()
                .user(user)
                .show(show)
                .seats(savedSeat)
                .amount(amount)
                .status(BookingStatus.PENDING)
                .bookedAt(new Date())
                .payments(Collections.emptyList())
                .build();
        return bookingRepository.save(booking);

    }
}
