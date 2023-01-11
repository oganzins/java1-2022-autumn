package lv.javaguru.training.lesson9;

public abstract class Employee implements Payable {
   private String firstName;
   private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return firstName;
    }

    public Employee ( String firstName, String lastName){
        this. firstName = firstName;
        this.lastName= lastName;
    }


}
