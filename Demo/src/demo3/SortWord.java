package demo3;
import java.util.*;

public class SortWord {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String temp;
		System.out.println("Enter the number of words you want to enter");
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		String names[] = new String[a];
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter words");
		
		for(int i=0; i<a; i++) {
			names[i] = s1.nextLine();
		}
		
		for(int i=0; i < a; i++) {
			for(int j=i+1; j< a; j++) {
				if(names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					
				}
			}
		}
		
		System.out.println("Sorted words are");
		for(int i=0; i<a-1; i++) {
			System .out.println(names[i] + " ");
		}
		System.out.println(names[a-1]);
		
	}

}
