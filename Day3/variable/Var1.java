package Day3assingment;

public class Var1 {
    // Instance variable
    private String name;
    private int employeeId;
    
    // Static variable
    private static String companyName = "TechCorp";
    
    // Constructor
    public Var1(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    // Method with local variable
    public void displayEmployeeInfo() {
        // Local variable
        String designation = "Software Engineer";
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
    }
    
    // Static method accessing static variable
    public static void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
    }
    
    public static void main(String[] args) {
        Var1 emp1 = new Var1("John Doe", 1001);
        emp1.displayEmployeeInfo();
        Var1.displayCompanyInfo();
    }
}
