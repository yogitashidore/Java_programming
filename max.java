//write a program to print max number in java using ternary operator.

package mainjava;

import java.util.Scanner;

public class add {
public static void main(String[] args) {
	int a, b, c, d;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter all three numbers:");
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();
	d = c >(a > b ? a : b)? c : ((a > b) ? a : b);
	
		System.out.println("Largest Number :"+d);
		
	
}
}

