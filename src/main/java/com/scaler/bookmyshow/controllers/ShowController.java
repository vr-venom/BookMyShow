package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.Models.Show;
import com.scaler.bookmyshow.dtos.CreateShowRequest;
import com.scaler.bookmyshow.services.ShowServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ShowController {
    private ShowServices showServices;

    @GetMapping("/show/{id}")
    public Show readShow(@PathVariable Long id){
        return showServices.getShow(id);
    }

    @PostMapping("/show")
    public Show createShow(@RequestBody CreateShowRequest request){
    return showServices.createShow(request);
    }
}
