//write a program to print below pattern
*
  *
    *

package mainjavaproject;

public class pattern {
	public static void main(String[] args)
	{
		for(int row=0; row<=2; row++)
		{
			for(int col= 0; col<=2; col++)
			{
				if(row == col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	

}
