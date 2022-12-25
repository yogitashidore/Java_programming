//write a program for multiplication of two number

package hello;

import java.io.*;
class ass{
 public static void main(String args[]) throws Exception {
  int a, b, c;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the two numbers to mul:");
  a = Integer.parseInt(br.readLine());
  b = Integer.parseInt(br.readLine());
  c = a * b;
  System.out.println("\nMul of two numbers:" + c);
 }
}
