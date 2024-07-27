package exercise6;

public class Main {
    public static void main(String[] args) {
        // Corrected the class name Employee (was Employeee)
        Employee e1 = new Employee("Mashrafi Uddin", "Software Engineer", 120000);

        // Call the method to print employee details
        e1.printEmployeeDetails();
        e1.raiseSalary(8);
        System.out.println("\n After raising salary: ");
        System.out.println("\n8% for 'Mashrafi Uddin': ");
        e1.printEmployeeDetails();

        Employee e2 = new Employee("Sakiba Belal", "Software Engineer", 100000);

        // Call the method to print employee details
        e2.printEmployeeDetails();
        e2.raiseSalary(8);
        System.out.println("\n After raising salary: ");
        System.out.println("\n8% for 'Sakiba Belal': ");
        e2.printEmployeeDetails();
    }
}
