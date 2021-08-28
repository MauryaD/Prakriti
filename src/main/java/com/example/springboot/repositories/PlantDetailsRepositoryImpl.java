package com.example.springboot.repositories;

import com.example.springboot.model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlantDetailsRepositoryImpl implements PlantDetailsRepository{

    private static final String GET_ALL_PLANT_DETAILS = "SELECT * FROM PLANT_DETAILS";
    private static final String GET_PLANT_DETAILS = "SELECT * FROM PLANT_DETAILS WHERE id = ?";
    private static final String CREATE_PLANT_DETAILS = "INSERT INTO PLANT_DETAILS(id, name, species) VALUES(?,?,?)";
    private static final String UPDATE_PLANT_DETAILS = "UPDATE PLANT_DETAILS SET name = ?, species = ? WHERE id = ?";
    private static final String DELETE_PLANT_DETAILS = "DELETE FROM PLANT_DETAILS WHERE id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer create(PlantDetails plantDetails) {
        return jdbcTemplate.update(CREATE_PLANT_DETAILS,
                plantDetails.getId(),
                plantDetails.getName(),
                plantDetails.getSpecies());
    }

    public int update(PlantDetails plantDetails) {
        return jdbcTemplate.update(UPDATE_PLANT_DETAILS,
                plantDetails.getName(),
                plantDetails.getSpecies(),
                plantDetails.getId());
    }

    @Override
    public PlantDetails getPlant(Integer id) {
        return jdbcTemplate.queryForObject(GET_PLANT_DETAILS,
                new Object[] {id}, (rs, n) -> new PlantDetails(rs.getInt("id"),
                        rs.getString("name"), rs.getString("species")));
    }

    @Override
    public List<PlantDetails> getAllPlants() {
        return jdbcTemplate.query(GET_ALL_PLANT_DETAILS, (rs,n) -> new PlantDetails(rs.getInt("id"),
                rs.getString("name"), rs.getString("species")));

    }

    @Override
    public void deletePlant(Integer id) {
        jdbcTemplate.update(DELETE_PLANT_DETAILS, id);
    }
}
