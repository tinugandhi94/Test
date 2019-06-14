
package demo;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double a,b,c;
		
		System.out.println("Enter a number");
		
		Scanner obj = new Scanner(System.in);
		
		a = obj.nextDouble();
		
		System.out.println("Enter 2nd num");
		
		Scanner obj2 = new Scanner(System.in);
		
		b= obj2.nextDouble();
		
		System.out.println("Enter 3rd");
		
		Scanner obj3 = new Scanner(System.in);
		
		c= obj3.nextDouble();
		
		
		if(a > b && b > c) {
			System .out.println(a);
		}
		
		else if(b>a && a>c) {
			System .out.println(b);
		}
		
		else {
			System.out.println(c);
		}
	}

}
