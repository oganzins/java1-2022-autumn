# 15. Nodarbība
## Uzdevums
### Latvijas pilsētas

**Klase City**

Pa soļiem:
1. Izveidojam klasi **City**
```java
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

```

**Klase Cities**

Pa soļiem:
1. Izveidojam klasi **Cities**
```java
public class Cities {

    public static List<City> get() {
        List<City> cities = new LinkedList<>();
        cities.add(new City("Ādaži", 7482));
        cities.add(new City("Ainaži", 701));
        cities.add(new City("Aizkraukle", 7198));
        cities.add(new City("Aizpute", 4128));
        cities.add(new City("Aknīste", 995));
        cities.add(new City("Aloja", 1073));
        cities.add(new City("Alūksne", 6945));
        cities.add(new City("Ape", 832));
        cities.add(new City("Auce", 2360));
        cities.add(new City("Baldone", 3789));
        cities.add(new City("Baloži", 6992));
        cities.add(new City("Balvi", 6103));
        cities.add(new City("Bauska", 10202));
        cities.add(new City("Brocēni", 3009));
        cities.add(new City("Cēsis", 16190));
        cities.add(new City("Cesvaine", 1280));
        cities.add(new City("Dagda", 1887));
        cities.add(new City("Daugavpils", 86872));
        cities.add(new City("Dobele", 9031));
        cities.add(new City("Durbe", 520));
        cities.add(new City("Grobiņa", 3778));
        cities.add(new City("Gulbene", 7171));
        cities.add(new City("Iecava", 5677));
        cities.add(new City("Ikšķile", 7698));
        cities.add(new City("Ilūkste", 2312));
        cities.add(new City("Jaunjelgava", 1825));
        cities.add(new City("Jēkabpils", 22134));
        cities.add(new City("Jelgava", 58154));
        cities.add(new City("Jūrmala", 56862));
        cities.add(new City("Kandava", 3501));
        cities.add(new City("Kārsava", 1970));
        cities.add(new City("Koknese", 2562));
        cities.add(new City("Krāslava", 7771));
        cities.add(new City("Kuldīga", 10395));
        cities.add(new City("Ķegums", 2147));
        cities.add(new City("Ķekava", 5190));
        cities.add(new City("Lielvārde", 6085));
        cities.add(new City("Liepāja", 73333));
        cities.add(new City("Līgatne", 1092));
        cities.add(new City("Limbaži", 7059));
        cities.add(new City("Līvāni", 7388));
        cities.add(new City("Lubāna", 1555));
        cities.add(new City("Ludza", 7767));
        cities.add(new City("Madona", 7129));
        cities.add(new City("Mazsalaca", 1143));
        cities.add(new City("Mārupe", 1796));
        cities.add(new City("Ogre", 24075));
        cities.add(new City("Olaine", 10475));
        cities.add(new City("Pāvilosta", 850));
        cities.add(new City("Piltene", 877));
        cities.add(new City("Pļaviņas", 2950));
        cities.add(new City("Preiļi", 6326));
        cities.add(new City("Priekule", 1912));
        cities.add(new City("Rēzekne", 28785));
        cities.add(new City("Rīga", 655090));
        cities.add(new City("Rūjiena", 2766));
        cities.add(new City("Sabile", 1430));
        cities.add(new City("Salacgrīva", 2624));
        cities.add(new City("Salaspils", 18602));
        cities.add(new City("Saldus", 10168));
        cities.add(new City("Saulkrasti	", 3430));
        cities.add(new City("Seda", 1197));
        cities.add(new City("Sigulda", 14817));
        cities.add(new City("Skrunda", 1985));
        cities.add(new City("Smiltene", 5334));
        cities.add(new City("Staicele", 861));
        cities.add(new City("Stende", 1605));
        cities.add(new City("Strenči", 1042));
        cities.add(new City("Subate", 591));
        cities.add(new City("Talsi", 9350));
        cities.add(new City("Tukums", 17572));
        cities.add(new City("Valdemārpils", 1234));
        cities.add(new City("Valka", 4935));
        cities.add(new City("Valmiera", 24269));
        cities.add(new City("Vangaži", 3512));
        cities.add(new City("Varakļāni", 1755));
        cities.add(new City("Ventspils", 35660));
        cities.add(new City("Viesīte", 1530));
        cities.add(new City("Viļaka", 1245));
        cities.add(new City("Viļāni", 2831));
        cities.add(new City("Zilupe", 1369));
        return cities;
    }
    
}
```
**CityCatalog izveide**

Pa soļiem:
1. Izveidojam interfeisu **CityCatalog**
```java
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
```
2. Izveidojam klasi **SimpleCityCatalog**
```java
public class SimpleCityCatalog implements CityCatalog {

    private List<City> cities;

    public SimpleCityCatalog() {
        cities = Cities.get();
    }


    @Override
    public Optional<City> findByName(String name) {
        return null;
    }

    @Override
    public Optional<City> findBiggestCity() {
        return null;
    }

    @Override
    public Optional<City> findSmallestCity() {
        return null;
    }

    @Override
    public List<City> findTop10BiggestCities() {
        return null;
    }

    @Override
    public List<City> findTop10SmallestCities() {
        return null;
    }

    @Override
    public Integer countTotalCityPopulation() {
        return 0;
    }

    @Override
    public Integer calculateAverageCityPopulation() {
        return 0;
    }

    @Override
    public List<City> findCitiesByNamePart(String namePart) {
        return null;
    }

}
```
3. Implementējam metodes pielietojos **Stream API**
   1) findByName - izmantojam filter metodi un pēc tam findFirst;
   2) findBiggestCity - izmantojam sorted metodi un pēc tam findFirst;
   3) findSmallestCity - izmantojam sorted metodi un pēc tam findFirst;
   4) findTop10BiggestCities - izmantojam sorted metodi, tad limit metodi un visbeidzot collect metodi;
   5) findTop10SmallestCities - izmantojam sorted metodi, tad limit metodi un visbeidzot collect metodi;
   6) countTotalCityPopulation - imantojam map metodi un reduce metodi;
   7) calculateAverageCityPopulation - iegūstam kopējo pilsētu populāciju un dalām to ar pilsētu skaitu;
   8) findCitiesByNamePart - izmantojam filter metodi, kurā salīdzinām nosaukumus izmantojot String.startWidth metodi. Pēc filter metodes izsaucam collect metodi.

**Klase SimpleCityCatalogTest**
1. Izveidojam testa klasi SimpleCityCatalogTest un pārbaudām vai visi testi ir veiksmīgi
```java
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
```