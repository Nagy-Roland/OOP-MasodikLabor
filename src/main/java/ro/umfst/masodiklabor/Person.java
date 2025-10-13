
package ro.umfst.masodiklabor;

public class Person {
    
    private final String username;
    private final int age;

    public Person(String username, int age) {
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
