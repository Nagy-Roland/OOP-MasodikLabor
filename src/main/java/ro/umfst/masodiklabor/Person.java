
package ro.umfst.masodiklabor;

public class Person {
    
    private final String username;
    private final int age;
    static  final int  minimalber = 500;
    public Person(String username, int age, int minimalber) {
        this.username = username;
        this.age = age;  
        
    }
    
    public void sayHello() {
        System.out.println("Hello, my name is " + username);
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }   
    
   
}
