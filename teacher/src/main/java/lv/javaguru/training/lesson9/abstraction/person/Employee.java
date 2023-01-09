package lv.javaguru.training.lesson9.abstraction.person;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String firstName, String lastName, int age, String jobTitle) {
        super(firstName, lastName, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                "} " + super.toString();
    }
}
