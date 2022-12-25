//program to print n number by taking n from user

package hello;

import java.io.*;
class ass{
 public static void main(String args[]) throws Exception {
  int no;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the value of input:");
  no= Integer.parseInt(br.readLine());
  for(int i=1; i<=no; i++)
  {
  
  System.out.println(i);
 }
 
  
}
}
