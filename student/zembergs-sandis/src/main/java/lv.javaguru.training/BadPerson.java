package lv.javaguru.training;

public class BadPerson {

    public String firstName;
    public String lastName;
    public int age;
    public double weight;

    BadPerson() {
        this.firstName = firstName;

    }
    BadPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getfirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return age;
    }
    public double weight() {
        return weight;
    }
    public static void main(String[] args) {
        BadPerson Es = new BadPerson();
        Es.setFirstName("Sandis");
        Es.setLastName("Zembergs");
        Es.setAge(24);
        Es.setWeight(94);

        Es.Cilveks();

    }

    private void Cilveks() {

        System.out.println("Mans vards-" + firstName);
        System.out.println("Mans uzvards-" + lastName);
        System.out.println("Age-" + age);
        System.out.println("Svars-" + weight);
    }

}
