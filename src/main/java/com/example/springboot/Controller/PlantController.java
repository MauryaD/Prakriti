package com.example.springboot.Controller;

import com.example.springboot.model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.services.PlantService;

import java.util.List;

@RestController
public class PlantController {

    @Autowired
    private PlantService plantService;

    @GetMapping("/plants/{id}")
    public PlantDetails getPlant(@PathVariable Integer id){ return plantService.getPlantDetails(id);}

    @GetMapping("/allPlants")
    public List<PlantDetails> getAllPlantDetails(){
        return plantService.getAllPlants();
    }

    @DeleteMapping("/plants/{id}")
    public void deletePlant(@PathVariable Integer id){ plantService.deletePlantDetails(id);}
}
