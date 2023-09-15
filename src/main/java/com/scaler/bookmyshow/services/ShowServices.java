package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.Models.Movie;
import com.scaler.bookmyshow.Models.Show;
import com.scaler.bookmyshow.Models.ShowSeat;
import com.scaler.bookmyshow.dtos.CreateShowRequest;
import com.scaler.bookmyshow.repositories.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ShowServices {
    private ShowRepository showRepository;
    public Show createShow(CreateShowRequest request){

        //get the movie id by calling MovieServices
        // call movieRepo from movieServices
        Movie movie = null;


        Show show = Show.builder()
                .startTime(request.getStartTime())
                .duration(request.getDurations())
                .movie(movie)
                .build();

        Show savedShow = showRepository.save(show);

        //Task 2 get the seats from Hall
        //create showSeat from savedShow

        List<ShowSeat> seats = Collections.emptyList();
        return showRepository.save(savedShow.toBuilder().showseats(seats).build());
    }
    public Show getShow(Long id){

        return showRepository
                .findById(id)
                .orElseThrow(() ->new NoSuchElementException("Invalid Show ID :" + id));
    }
}
