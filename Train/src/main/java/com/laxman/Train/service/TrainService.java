package com.laxman.Train.service;

import com.laxman.Train.entity.Train;
import com.laxman.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;

    public TrainService (TrainRepository trainRepository)
    {
        this.trainRepository=trainRepository;
        
    }

    public Train addTrain(Train train) {
        return  trainRepository.save(train);
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }
}
