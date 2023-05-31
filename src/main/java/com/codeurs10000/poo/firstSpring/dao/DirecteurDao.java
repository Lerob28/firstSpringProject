package com.codeurs10000.poo.firstSpring.dao;

import com.codeurs10000.poo.firstSpring.fakeDataBase.FakeHumanResourceDataBase;
import com.codeurs10000.poo.firstSpring.models.Director;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Borel Njeunkwe alias Lerob28
 */
@Component
public class DirecteurDao {
    public List<Director> getAll() {
        return FakeHumanResourceDataBase.getInstance();
    }

    public Director getById(int id) {
        return FakeHumanResourceDataBase.getInstance().get(id);
    }

    public List<Director> save(Director director) {
        var directors = FakeHumanResourceDataBase.getInstance();
        directors.add(director);
        FakeHumanResourceDataBase.setDirectors(directors);
        return getAll();
    }

    public List<Director> delete(Director director) {
        var directors = FakeHumanResourceDataBase.getInstance();
        directors.remove(director);
        FakeHumanResourceDataBase.setDirectors(directors);
        return getAll();
    }
}
