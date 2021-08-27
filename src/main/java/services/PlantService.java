package services;


import model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PlantDetailsRepository;

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
