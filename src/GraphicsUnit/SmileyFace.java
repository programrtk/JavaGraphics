package GraphicsUnit;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SmileyFace extends Canvas

{

    public static void main(String[] args) {
              
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Title: My face");
        Canvas canvas = new SmileyFace();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true);               
    }

    public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 250, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      window.setColor(Color.GREEN);
      window.fillOval(300, 200, 50, 40);
      
      window.fillOval(450, 200, 50, 40);
      
      window.setColor(Color.BLACK);
      window.fillOval(400, 300, 40, 40);
      
      window.setColor(Color.RED);
      window.drawArc(350, 370, 150, 50, -30, -200);


   }
}
