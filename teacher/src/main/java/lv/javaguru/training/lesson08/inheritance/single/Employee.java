package lv.javaguru.training.lesson08.inheritance.single;

public class Employee extends Person {

    private String jobTitle;
    private String department;

    public Employee(String firstName, String lastName, int age, String jobTitle, String department) {
        super(firstName, lastName, age);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                "} " + super.toString();
    }
}
