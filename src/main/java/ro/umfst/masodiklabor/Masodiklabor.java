
package ro.umfst.masodiklabor;
import java.util.ArrayList;
import java.util.List;

public class Masodiklabor {
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alice", 28, "E123", "IT");
        Manager mgr1 = new Manager("Bob", 40, "M456", "HR", 5);
        Employee emp2 = new Employee("John", 29, "E126", "IT");
        Manager mgr2 = new Manager("Alex", 24, "M466", "SV", 7);
        Employee emp3 = new Employee("Anna", 48, "E123", "IT");
        Manager mgr3 = new Manager("Hannah", 30, "M650", "SC", 4);
        Employee emp4 = new Employee("Ali", 37, "E123", "LP");
        Manager mgr4 = new Manager("Kenny", 70, "M226", "HR", 10);
        Director drc1 = Director.getInstance("Joseph",68,0);
        
        List<Person> people = new ArrayList<>();
        
        people.add(emp1);
        people.add(mgr1);
        people.add(emp2);
        people.add(mgr2);
        people.add(emp3);
        people.add(mgr3);
        people.add(emp4);
        people.add(mgr4);
        people.add(drc1);
        
        drc1.addManager(mgr1);
        drc1.addManager(mgr2);
        drc1.addManager(mgr3);
        drc1.addManager(mgr4);
        
        System.out.println("Employee: " + emp1.getUsername() + ", Dept: " + emp1.getDepartment());
        System.out.println("Manager: " + mgr1.getUsername() + ", Team Size: " + mgr1.getTeamSize());
        System.out.println("Employee: " + emp2.getUsername() + ", Dept: " + emp2.getDepartment());
        System.out.println("Manager: " + mgr2.getUsername() + ", Team Size: " + mgr2.getTeamSize());
        System.out.println("Employee: " + emp3.getUsername() + ", Dept: " + emp3.getDepartment());
        System.out.println("Manager: " + mgr3.getUsername() + ", Team Size: " + mgr3.getTeamSize());
        System.out.println("Employee: " + emp4.getUsername() + ", Dept: " + emp4.getDepartment());
        System.out.println("Manager: " + mgr4.getUsername() + ", Team Size: " + mgr4.getTeamSize());
        
        for (Person person : people) {
            person.sayHello(); 
        }
    }   
}

