package com.example.springboot.repositories;

import com.example.springboot.model.PlantDetails;

import java.util.List;

public interface PlantDetailsRepository {
    Integer create(PlantDetails plantDetails);   //C reate
    void update(PlantDetails plantDetails);     // U pdate
    PlantDetails getPlant(Integer id);          // R ead
    List<PlantDetails> getAllPlants();          // R ead
    void deletePlant(Integer id);              // D elete

}