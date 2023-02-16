package lv.javaguru.training.lesson15.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleCityCatalog implements CityCatalog {

    private List<City> cities;

    public SimpleCityCatalog() {
        cities = Cities.get();
    }


    @Override
    public Optional<City> findByName(String name) {

        Optional<City> byName = cities.stream()
                .filter(cities -> cities.getName().equals(name))
                .findFirst();
        return byName;
    }

    @Override
    public Optional<City> findBiggestCity() {
        Optional<City> biggestCity = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation).reversed())
                .findFirst();
        return biggestCity;
    }

    @Override
    public Optional<City> findSmallestCity() {
        Optional<City> smallestCity = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation))
                .findFirst();
        return smallestCity;
    }

    @Override
    public List<City> findTop10BiggestCities() {
        List<City> biggestCities = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());
        return biggestCities;
    }

    @Override
    public List<City> findTop10SmallestCities() {
        List<City> smallestCities = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation))
                .limit(10)
                .collect(Collectors.toList());
        return smallestCities;
    }

    @Override
    public Integer countTotalCityPopulation() {
        int total = getTotalPopulation();

        return total;
    }

    @Override
    public Integer calculateAverageCityPopulation() {
        int average = getTotalPopulation();
        return average / cities.size();
    }

    @Override
    public List<City> findCitiesByNamePart(String namePart) {
        List<City> citiesByPart = cities.stream()
                .filter(cities -> cities.getName().contains(namePart))
                .collect(Collectors.toList());
        return citiesByPart;
    }

    private Integer getTotalPopulation() {
        return cities.stream()
                .map(City::getPopulation)
                .reduce(0, Integer::sum);
    }


}
