package com.codeurs10000.poo.firstSpring.services;

import com.codeurs10000.poo.firstSpring.dao.DirecteurDao;
import com.codeurs10000.poo.firstSpring.models.Director;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.codeurs10000.poo.firstSpring.utils.Utility.MAJOR_AGE;

@Service
@AllArgsConstructor
public class HumanResourcesService {
    private final DirecteurDao directeurDao;

    /*public HumanResourcesService(DirecteurDao directeurDao) {
        this.directeurDao = directeurDao;
    }*/

    public List<Director> DirectorList() {
        return directeurDao.getAll();
    }


    public double MediumAgeOfMajorDirector() {
        var directors = DirectorList();
        var mediumAge = directors.stream()
                .filter(director -> director.getAge() > MAJOR_AGE)
                .mapToInt(director -> director.getAge())
                .average()
                .getAsDouble();

        return mediumAge;
    }


    public String FirstMajorDirectorName() {
        var directors = DirectorList();
        var name = directors.stream()
                .filter(director -> director.getAge() > MAJOR_AGE)
                .findFirst()
                .get()
                .getFirstName();
        return name;
    }
}
