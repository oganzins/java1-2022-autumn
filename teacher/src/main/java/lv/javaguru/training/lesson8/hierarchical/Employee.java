package lv.javaguru.training.lesson8.hierarchical;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
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
