package lv.javaguru.training.lesson15.homework;

import java.util.List;
import java.util.Optional;

public interface CityCatalog {
    Optional<City> findByName(String name);

    Optional<City> findBiggestCity();

    Optional<City> findSmallestCity();

    List<City> findTop10BiggestCities();

    List<City> findTop10SmallestCities();

    Integer countTotalCityPopulation();

    Integer calculateAverageCityPopulation();

    List<City> findCitiesByNamePart(String namePart);
}
