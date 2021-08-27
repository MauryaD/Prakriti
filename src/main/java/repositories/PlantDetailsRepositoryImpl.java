package repositories;

import model.PlantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlantDetailsRepositoryImpl implements PlantDetailsRepository{

    private static final String GET_ALL_PLANT_DETAILS = "SELECT * FROM PLANT_DETAILS";
    private static final String GET_PLANT_DETAILS = "SELECT * FROM PLANT_DETAILS WHERE id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer create(PlantDetails plantDetails) {
        return null;
    }

    @Override
    public void update(PlantDetails plantDetails) {

    }

    @Override
    public PlantDetails getPlant(Integer id) {
        return jdbcTemplate.queryForObject(GET_PLANT_DETAILS,
                new Object[] {id }, (rs, n) -> new PlantDetails(rs.getInt("id"),
                        rs.getString("name"), rs.getString("species")));
    }

    @Override
    public List<PlantDetails> getAllPlants() {
        return jdbcTemplate.query(GET_PLANT_DETAILS, (rs,n) -> new PlantDetails(rs.getInt("id"),
                rs.getString("name"), rs.getString("species")));

    }

    @Override
    public void deletePlant(Integer id) {

    }
}
