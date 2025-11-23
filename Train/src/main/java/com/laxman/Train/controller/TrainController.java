package com.laxman.Train.controller;

import com.laxman.Train.entity.Train;
import com.laxman.Train.service.TrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;
    public TrainController(TrainService trainService){
        this.trainService=trainService;

    }

    @GetMapping
    public List<Train> getAllTrains()
    {
        return trainService.getAllTrains();
    }

    public Train addTrain(@RequestBody Train train)
    {
        return trainService.addTrain(train);
    }

}
