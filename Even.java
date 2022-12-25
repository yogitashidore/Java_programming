//write a program to print even,odd number

package hello;

import java.io.*;
class ass{
 public static void main(String args[]) throws Exception {
  int num1;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the value of num1:");
  num1= Integer.parseInt(br.readLine());
  if(num1%2==0)
  {
  
  System.out.println("\nEven number:" );
 }
  else
  {
	  System.out.println("odd number");
  }
}
}
