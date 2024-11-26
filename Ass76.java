package Assignments;
class Parent1 {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
class Child1 extends Parent1 {   
    int age;   
    
    // Performing overriding  
      
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
public class Ass76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Parent p = new Child();  
        p.name = "Shubham";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
        c.showMessage();   
	}

}
