package lv.lv.javaguru.training.lesson15.homework;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleCityCatalog implements CityCatalog {

    private final List<City> cities;

    public SimpleCityCatalog() {
        cities = Cities.get();
    }


    @Override
    public Optional<City> findByName(String name) {
        Optional<City> cityName = cities.stream()
                .filter(city -> city.getName().equals(name))
                .findFirst();
        return cityName;
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
        List<City> top10BiggestCities = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());
        return top10BiggestCities;
    }

    @Override
    public List<City> findTop10SmallestCities() {
        List<City> top10SmallestCities = cities.stream()
                .sorted(Comparator.comparing(City::getPopulation))
                .limit(10)
                .collect(Collectors.toList());
        return top10SmallestCities;
    }

    @Override
    public Integer countTotalCityPopulation() {
        return cities.stream()
                .map(City::getPopulation)
                .reduce(0, Integer::sum);
    }

    @Override
    public Integer calculateAverageCityPopulation() {
        return countTotalCityPopulation() / cities.size();
    }

    @Override
    public List<City> findCitiesByNamePart(String namePart) {
        List<City> findByNamePart = cities.stream()
                .filter(cities -> cities.getName().contains(namePart))
                .collect(Collectors.toList());
        return findByNamePart;
    }

}
