package Assignments;
class Parent {
    String name;
    void method()
    {
        System.out.println("Method from Parent");
    }
}
class Child extends Parent {
    int id;
 
    @Override void method()
    {
        System.out.println("Method from Child");
    }
}
public class Ass66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
        p.name = "harika";
 
        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overridden method hence this will be executed
        p.method();
 
	}

}
