package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.Models.Hall;
import com.scaler.bookmyshow.dtos.createHallRequest;
import com.scaler.bookmyshow.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HallController {
    private HallService hallService;
    @PostMapping("/hall")
    public Hall createHall (@RequestBody createHallRequest request ){
        return null;
    }

}
