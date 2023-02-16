package lv.javaguru.training.lesson15.homework;

public class City {
    private final String name;
    private final Integer population;

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }
}
