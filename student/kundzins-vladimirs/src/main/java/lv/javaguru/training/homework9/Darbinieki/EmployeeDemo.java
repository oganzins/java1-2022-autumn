package lv.javaguru.training.homework9.Darbinieki;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee("John", "Smith", 10, 160);
        System.out.println("Hourly employee salary: " + hourlyEmployee.pay());

        Employee salariedEmployee = new SalariedEmployee("Jane", "Doe", 2000.00);
        System.out.println("Salaried employee salary: " + salariedEmployee.pay());

        Employee executive = new Executive("Jeffry", "Bezos", 5000, 5000);
        System.out.println("Executive salary: " + executive.pay());
    }
}
