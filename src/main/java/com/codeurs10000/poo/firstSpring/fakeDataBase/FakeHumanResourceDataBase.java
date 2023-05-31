package com.codeurs10000.poo.firstSpring.fakeDataBase;

import com.codeurs10000.poo.firstSpring.models.Director;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @Author : Njeunkwe borel alias Lerob28
 */
public final class FakeHumanResourceDataBase {
    // singleton Design Pattern
    private static List<Director> directors;

    private FakeHumanResourceDataBase() {
        directors = selectAllDirectorFromDataBase();
    }

    public static List<Director> getInstance() {
        //if (directors == null) {
        if (!Optional.ofNullable(directors).isPresent()) {
            directors = selectAllDirectorFromDataBase();
        }
        return directors;
    }


    public static List<Director> selectAllDirectorFromDataBase() {
        var Director1 = Director.builder()
                .lastName("Borel")
                .firstName("Njeunkwe")
                .age(22)
                .build();

        var Director2 = Director.builder()
                .lastName("Kevin")
                .firstName("Tonbong")
                .age(25)
                .build();

        var Director3 = Director.builder()
                .lastName("Franck")
                .firstName("Mbomen")
                .age(14)
                .build();

        var Director4 = Director.builder()
                .lastName("Tchuinkeu")
                .firstName("John")
                .age(07)
                .build();

        List<Director> directorList = new ArrayList<>();

        directorList.add(Director1);
        directorList.add(Director2);
        directorList.add(Director3);
        directorList.add(Director4);

        return directorList;
    }

    public static void setDirectors(List<Director> directors) {
        FakeHumanResourceDataBase.directors = directors;
    }
}
