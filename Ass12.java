package Assignments;

import java.util.Scanner;

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r; 
		double area; 
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter radius of circle:"); 
		r = s.nextInt(); 
		area = Math.PI*r*r; 
		System.out.println("Area of circle:"+area);

	}

}
