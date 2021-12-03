package threadClass;
import java.util.Random;
 
public class ClassTest {
 
    public static void main(String[] args) {
        
        ClassThatMakesThreads t1 = new ClassThatMakesThreads(5000);
        Thread th1 = new Thread(t1);
        th1.start();
        
        
        ClassThatMakesThreads t2= new ClassThatMakesThreads(3000);
        Thread th2 = new Thread(t2);
        th2.start();
        
        
        System.out.println("Hello world");
        
    }
 
}
 
class ClassThatMakesThreads implements Runnable {
    
    private int timer;
    
    public ClassThatMakesThreads(int timer) {
        this.timer = timer;
    }
    
    
    public void run() {
        
        for(;;) {
            System.out.println((int)Math.floor(Math.random()*90000+10000));
        
            
                try {
                    Thread.sleep(timer);
                    
                } catch (Exception e) {
                    // in a thread sleep situation, 
                    //it is very unlikely that the program will reach this block of code
                    System.out.println("Wrong sleep");
                }
            
 
        }
    }
}
 
    
    
//Create a thread that prints in the console every 5 seconds a random amount of 5 digits long
 
 
 
 
//
////Create an interface called DogRules. 
////This interface should contain a public method called  bark() and should return void
//
//interface DogRules{
//  public void bark();
//}
//
//class Dog implements DogRules{
//
//  private String name, breed, age;
//
//  public Dog(String name, String breed, String age) {
//          
//      this.name = name;
//      this.breed = breed;
//      this.age = age;
//  }
//
//  public  void bark() {
//  System.out.println(name + ": woof");
//  }
//}
 
 
 
// Define a class with the following props: A dog class with name, breed and age 
// The class should have a constructor setting up all the properties of the class
 
//class Dog {
//  
//  private String name, breed, age;
//  
//  public Dog(String name, String breed, String age) {
//      
//      this.name = name;
//      this.breed = breed;
//      this.age = age;
//  }
//}
 
//The class should have a constructor setting up no properties
//
//class Dog{
//  
//  private String name;
//  private String age;
//  private String breed;
//  
//  
//  public Dog() {
//      
//  }
//  
//}
 
//This class should have a constructor that takes no variables but sets all available properties to empty strings
 
//
//class Dog{
//
//
//  private String name;
//  private String age;
//  private String breed;
//
//  public Dog() {
//      this.name = "Erin";
//      this.age = "";
//      this.breed = "";
//  }
//  
//  public void bark() {
//      
//      System.out.println(name + ": woof");
//      
//  }
//  
//}
 
 
 
////Dog dog = new Dog("Erin", "Pug", "10");
////dog.bark();
//
////create the object (t1) using the runnable class 
////or the class that is using the runnable interface
//ThreadClass t1 = new ThreadClass();
//
////create a thread object (th) and pass the runnable object(t1) in the constructor
//// of the thread (Thread(t1))
//Thread th = new Thread(t1);
//
////start the thread or
//// execute the block of code inside the run function.
//th.start();