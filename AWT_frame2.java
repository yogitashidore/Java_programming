//demostration of frame using awt.

package demo;

import java.awt.*;

public class awt_frame extends Frame 
{
   awt_frame(String name)
   {
	   super(name);
   }
   public static void main(String args[])
   {
	   awt_frame f = new awt_frame("my first awt frame");
	   f.setSize(500,508);
	   
	   f.setVisible(true);
   }
}
