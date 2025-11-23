package com.laxman.Train.controller;


import com.laxman.Train.entity.Station;
import com.laxman.Train.entity.Train;
import com.laxman.Train.entity.TrainSchedule;
import com.laxman.Train.repo.StationRepository;
import com.laxman.Train.repo.TrainRepository;
import com.laxman.Train.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    StationRepository stationRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;


    @GetMapping
    public void test()
    {
        Station delhi=new Station(null,"New Delhi","NDLS");
        Station Mumbai=new Station(null,"CSMT","CSMT");
        Station Pune=new Station(null,"Pune Junction","PUNE");
        Station Chennai=new Station(null,"Chennai Central","MAS");

        stationRepository.saveAll(List.of(delhi,Mumbai,Pune,Chennai));

        Train rajdhani= new Train(null,"Rajdhani Express","12306",null);
        Train chennai= new Train(null,"Chennai Express","11220",null);
        Train hawda= new Train(null,"Howda Express","12004",null);
        Train udyan= new Train(null,"Udyan Express","10012",null);

        trainRepository.saveAll(List.of(rajdhani,chennai,hawda,udyan));


        TrainSchedule sc1=new TrainSchedule(null,rajdhani,delhi,Mumbai,"6:00","14:00");
        TrainSchedule sc2=new TrainSchedule(null,chennai,Mumbai,Chennai,"2:00","19:00");
        TrainSchedule sc3=new TrainSchedule(null,hawda,delhi,Pune,"9:00","12:00");
        TrainSchedule sc4=new TrainSchedule(null,udyan,Pune,Chennai,"3:00","17:00");

        trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3,sc4));
        System.out.println("Data inserted in the database");
    }
}
