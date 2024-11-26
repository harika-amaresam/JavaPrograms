package Assignments;

import java.util.Scanner;

public class Ass58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        float n1 = input.nextFloat();
        System.out.print("Enter the second Number: ");
        float n2 = input.nextFloat();
        System.out.println("Please enter the method to perform operations example: Type - add, sub, multi, divi, mod");
        System.out.print("Enter the Method to perform: ");
        String method = str.nextLine();
        
        
        switch (method) {
            case "add":
                System.out.println("The Addition of given two number is: " + (n1 + n2));
                break;
            
            case "sub":
                System.out.println("The Subtraction of given two number is: " + (n1 - n2));
                break;
            case "multi":
                System.out.println("The Multiplication of given two number is: " + (n1 * n2));
                 break;
            
            case "divi":
                System.out.println("The Division of given two number is: " +(n1 /n2));
                 break;
            
            case "mod":
                System.out.println("The Modulo of given two number is: " + (n1 % n2));
                 break;
            
            default:
                System.out.println("Please enter the method to perform operations example: Type - add, sub, multi, divi, mod");
                 break;   
        }
	}

}
