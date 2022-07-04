package model;

import java.time.LocalDate;

public class DadosOscar {
    private int index;
    private int year;
    private int age;
    private String name;
    private String movie;

    public DadosOscar(int index, int year, int age, String name, String movie) {
        this.index = index;
        this.year = year;
        this.age = age;
        this.name = name;
        this.movie = movie;
    }

    public int getIndex() {
        return index;
    }

    public Integer getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMovie() {
        return movie;
    }
    //Index; Year; Age; Name; Movie
}
