package com.example.springboot.services;


import com.example.springboot.model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.repositories.PlantDetailsRepository;

import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantDetailsRepository plantDetailsRepository;

    public PlantDetails getPlantDetails(Integer id){
        return plantDetailsRepository.getPlant(id);
    }

    public List<PlantDetails> getAllPlants(){
        return plantDetailsRepository.getAllPlants();
    }
}
