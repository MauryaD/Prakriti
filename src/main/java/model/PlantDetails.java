package model;

public class PlantDetails {
    private Integer id;
    private String name;
    private String species;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public PlantDetails(Integer id, String name, String species) {
        this.name = name;
        this.id = id;
        this.species = species;
    }
}
