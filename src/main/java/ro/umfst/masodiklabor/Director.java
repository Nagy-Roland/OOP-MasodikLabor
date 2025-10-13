
package ro.umfst.masodiklabor;

import java.util.ArrayList;
import java.util.List;



public class Director extends Person{
    
    private int salary;
    private static Director instance;
    private final List<Manager> managerList;
    
    
    public Director(String username,int age,int salary){
        super(username,age,minimalber);
        this.salary = salary;
        this.managerList = new ArrayList<>();
       
    }
    
    public static Director getInstance(String username,int age,int salary){
        
        if(instance == null){
            instance = new Director(username,age,salary);
        }
        return instance;
    }
    
     public void calculateSalary() {
        if (managerList != null) {
            salary = minimalber * managerList.size();
        } else {
            salary = 0;
        }
    }
    
    public void addManager(Manager manager){
        managerList.add(manager);
        calculateSalary();
    }
     
     public List<Manager> getManagerList() {
        return managerList;
    }
     
    public int getSalary(){
        return salary;
    }
@Override
    public void sayHello() {
        System.out.println("Hello, my name is " + getUsername() + " and i make " + getSalary());
    }
    
}

