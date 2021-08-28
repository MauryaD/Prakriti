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

    public Integer addPlant(PlantDetails plantDetails){
        return plantDetailsRepository.create(plantDetails);
    }

    public int updatePlantDetails(PlantDetails plantDetails){
        return plantDetailsRepository.update(plantDetails);
    }

    public void deletePlantDetails(Integer id){
        plantDetailsRepository.deletePlant(id);
    }
}
