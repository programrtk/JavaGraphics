package GraphicsUnit;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Canvas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
	xPos = x;
	//finish this constructor
        yPos = y;
        width = wid;
        height = ht;
        color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.drawOval(xPos, yPos, width, height);
      window.drawLine( xPos + width/3 , yPos + height, xPos + width/3, yPos + height + height/10);
      window.drawLine( xPos + 2*width/3 , yPos + height, xPos + 2*width/3, yPos + height + height/10);
//draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}

/*
public class MyShape extends Canvas
{

    public static void main(String[] args) {
              
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Title: MyShape");
        Canvas canvas = new SmileyFace();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true);               
    }

    public MyShape()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      Shape shape_1 = new Shape(100, 100, 100, 100); 
      shape_1.draw(window);
   }

}
*/