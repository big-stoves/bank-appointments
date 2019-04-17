package com.app.bankappointments.Controller;

import com.app.bankappointments.repository.HoursRepository;
import com.app.bankappointments.model.Hours;
import com.app.bankappointments.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class HoursController {

    @Autowired
    HoursRepository hoursRepository;

    // Get All Hours
    @GetMapping("/hours")
    public List<Hours> getAllHours() {
        return hoursRepository.findAll();
    }

}