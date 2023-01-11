package lv.javaguru.training.lesson9.abstraction.person;

public class Customer extends Person {

    private String country;

    public Customer(String firstName, String lastName, int age, String country) {
        super(firstName, lastName, age);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "country='" + country + '\'' +
                "} " + super.toString();
    }
}
