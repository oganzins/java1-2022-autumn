package lv.lv.javaguru.training.lesson15.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


class SimpleCityCatalogTest {

    private CityCatalog cityCatalog;

    @BeforeEach
    public void setUp() {
        cityCatalog = new SimpleCityCatalog();
    }

    @Test
    public void findsCityByName() {
        Optional<City> city = cityCatalog.findByName("Talsi");

        Assertions.assertTrue(city.isPresent());
        Assertions.assertEquals("Talsi", city.get().getName());
    }

    @Test
    public void failsToFindCityByName() {
        Optional<City> city = cityCatalog.findByName("XYZ");

        Assertions.assertFalse(city.isPresent());
    }

    @Test
    public void findsBiggestCity(){
        Optional<City> city = cityCatalog.findBiggestCity();

        Assertions.assertTrue(city.isPresent());
        Assertions.assertEquals("Rīga", city.get().getName());
    }

    @Test
    public void findsSmallestCity(){
        Optional<City> city = cityCatalog.findSmallestCity();

        Assertions.assertTrue(city.isPresent());
        Assertions.assertEquals("Durbe", city.get().getName());
    }

    @Test
    public void findsTop10BiggestCities() {
        List<City> cities = cityCatalog.findTop10BiggestCities();
        Assertions.assertEquals(10, cities.size());

        Iterator<City> iterator = cities.iterator();

        Assertions.assertEquals("Rīga",  iterator.next().getName());
        Assertions.assertEquals("Daugavpils",  iterator.next().getName());
        Assertions.assertEquals("Liepāja",  iterator.next().getName());
        Assertions.assertEquals("Jelgava",  iterator.next().getName());
        Assertions.assertEquals("Jūrmala",  iterator.next().getName());
        Assertions.assertEquals("Ventspils",  iterator.next().getName());
        Assertions.assertEquals("Rēzekne",  iterator.next().getName());
        Assertions.assertEquals("Valmiera",  iterator.next().getName());
        Assertions.assertEquals("Ogre",  iterator.next().getName());
        Assertions.assertEquals("Jēkabpils",  iterator.next().getName());
    }

    @Test
    public void findsTop10SmallestCities() {
        List<City> cities = cityCatalog.findTop10SmallestCities();
        Assertions.assertEquals(10, cities.size());

        Iterator<City> iterator = cities.iterator();

        Assertions.assertEquals("Durbe",  iterator.next().getName());
        Assertions.assertEquals("Subate",  iterator.next().getName());
        Assertions.assertEquals("Ainaži",  iterator.next().getName());
        Assertions.assertEquals("Ape",  iterator.next().getName());
        Assertions.assertEquals("Pāvilosta",  iterator.next().getName());
        Assertions.assertEquals("Staicele",  iterator.next().getName());
        Assertions.assertEquals("Piltene",  iterator.next().getName());
        Assertions.assertEquals("Aknīste",  iterator.next().getName());
        Assertions.assertEquals("Strenči",  iterator.next().getName());
        Assertions.assertEquals("Aloja",  iterator.next().getName());
    }

    @Test
    public void calculatesTotalCityPopulation() {
        int totalPopulation = cityCatalog.countTotalCityPopulation();

        Assertions.assertEquals(1394137, totalPopulation);
    }

    @Test
    public void calculatesAverageCityPopulation() {
        int averageCityPopulation = cityCatalog.calculateAverageCityPopulation();

        Assertions.assertEquals(17211, averageCityPopulation);
    }

    @Test
    public void findsCityByNamePart() {
        List<City> cities = cityCatalog.findCitiesByNamePart("Va");

        Assertions.assertEquals(cities.size(), 5);
    }

    @Test
    public void failsToFindByNamePart() {
        List<City> cities = cityCatalog.findCitiesByNamePart("New");

        Assertions.assertTrue(cities.isEmpty());
    }

}