//write a program to swap number in java.

package mainjava;

import java.util.Scanner;

public class add {
public static void main(String[] args) {
	int a, b, c;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of a, b:");
	a = s.nextInt();
	b = s.nextInt();
		System.out.println("before swapping Numbers :"+a+" "+b);
	/*swapping*/	
	c = a;
	a = b;
	b = c;
	System.out.println("After swapping: "+a+" "+b);
	System.out.println();
}
}


//output: Enter the value of a and b
3
5
before swapping numbers: 3 5
After swapping : 5 3
