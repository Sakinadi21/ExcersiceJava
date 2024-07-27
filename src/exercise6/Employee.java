package exercise6;

public class Employee {
    // Private fields for encapsulation
    private String name;
    private String jobTitle; // Corrected the capitalization to maintain consistency
    private double salary;

    // Constructor to initialize the employee's details
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle; // Corrected the capitalization
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for job title
    public String getJobTitle() { // Corrected method name to match field name capitalization
        return jobTitle; // Corrected the method to return the jobTitle field
    }

    // Setter for job title
    public void setJobTitle(String jobTitle) { // Corrected method name to match field name capitalization
        this.jobTitle = jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    // Method to print employee details
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle); // Corrected the variable name
        System.out.println("Salary: " + salary);
    }
}
