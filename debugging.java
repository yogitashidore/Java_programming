//Demonstrate debugging using break point.

package mainjava;

public class debugging {
public static void main(String args[])
{
	int i = 10;
	i = i + 100;
	System.out.println("value of i: "+i);
	i = i - 20;
	System.out.println("value of i:"+i);
}
}


//output:  value of i: 110
           value of i:90
