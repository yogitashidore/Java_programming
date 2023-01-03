//demonstration of frame using awt.

package mainjavaproject;

import java.awt.*;
public class Myframe extends Frame
{


	Myframe()
	{

		
	    this.setVisible(true);
	    this.setSize(500, 300);
	    this.setTitle("My frame");
	}
	
	public static void main(String args[])

	{
		Myframe f = new Myframe();
	}
	
}
