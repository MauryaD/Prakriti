package Controller;

import model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.PlantService;

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
}