package lv.javaguru.training.lesson08.inheritance.hierarchical;

public class Teacher extends Person {

    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
