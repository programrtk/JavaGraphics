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
import javax.swing.JFrame;

class Robot extends Canvas
{
   
    public static void main(String[] args) {
              
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Title: Robot");
        Canvas canvas = new Robot();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true);               
    }
    
    public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
		//add more code here
      
      //eyes
      window.setColor(Color.GREEN);
      window.fillOval(330, 130, 20, 20);
      window.fillOval(450, 130, 20, 20);
      
      //nose
      window.setColor(Color.BLACK);
      window.fillOval(400, 150, 15, 20);
      
      //mouth
      window.setColor(Color.RED);
      window.drawArc(350, 175, 100, 10, -30, -200);
				
   }

   public void upperBody( Graphics window )
   {
       //torso
       window.setColor(Color.BLUE);
       window.fillRect(330, 225, 150, 100);
       
       //left - arm
       window.setColor(Color.BLACK);
       window.drawLine(280, 175, 330, 225);
       
       //right-arm
       window.drawLine(480, 225, 530, 175);
       
   }

   public void lowerBody( Graphics window )
   {
       //abdomin
       window.setColor(Color.GRAY);
       window.fillRect(330, 350, 150, 100);
       
       //left - leg
       window.setColor(Color.BLACK);
       window.drawLine(330, 450, 280, 550);
       
       //right-leg
       window.drawLine(480, 450, 530, 550);
   }
}