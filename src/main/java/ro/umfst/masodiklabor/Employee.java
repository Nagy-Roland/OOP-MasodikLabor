
package ro.umfst.masodiklabor;

public class Employee extends Person {
    
    private final String employeeId;
    private final String department;
    
    
    public Employee(String username, int age, String employeeId, String department) {
        super(username, age, minimalber);  
        this.employeeId = employeeId;
        this.department = department; 
       
    }
@Override
    public void sayHello() {
        System.out.println("Hello im " + getUsername() +", my employee ID is " + getEmployeeId() + " and my department is "+ getDepartment());
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }
    
    

    
}

