
package ro.umfst.masodiklabor;

public final class Manager extends Employee {
    
    private final int teamSize;

    public Manager(String username, int age, String employeeId, String department, int teamSize) {
        super(username, age, employeeId, department); 
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
@Override
    public void sayHello() {
        System.out.println("Hello my name is " + getUsername() + ", my employee ID is " + getEmployeeId() + " and my team has " + getTeamSize() + " members");
    }      
}
