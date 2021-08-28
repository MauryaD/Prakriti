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

    @PostMapping("/plants")
    public Integer insertPlant(@RequestBody PlantDetails plantDetails){
        return plantService.addPlant(plantDetails);
    }

    @PutMapping("/plants/{id}")
    public int updatePlant(@PathVariable Integer id, @RequestBody PlantDetails plantDetails){
        return plantService.updatePlantDetails(plantDetails);
    }

    @DeleteMapping("/plants/{id}")
    public void deletePlant(@PathVariable Integer id){ plantService.deletePlantDetails(id);}
}
