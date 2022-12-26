//write a program to print Fibonacci series.
package mainjava;

import java.util.Scanner;
public class add {
public static void main(String[] args) {
	int n, a = 0, b = 0, c = 1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n = s. nextInt();
	System.out.print("Fibonacci Series:");
	for(int i = 1; i<= n; i++)	
	{
		a = b;
		b = c; 
		c = a + b;
		System.out.print(a+" ");
	}
}	
}
	
//output:   Enter value of n : 10
            Fibonacci series : 0 1 1 2 3 5 8 13 21 34 
