import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

int sum = 0;
Die one;
public void setup()
{
	size(610,610);
	noLoop();
}
public void draw()
{
	background(0);
	for(int y = 10; y <= 500; y = y + 60)
	{
		for(int x = 10; x <= 600; x = x + 60)
		{
			one = new Die(x,y);
			one.show();
			sum = sum + one.numDots;
		}
	}
	textSize(20);
	fill(255);
	text("Total sum : " + sum,10,570);
}
public void mousePressed()
{
	redraw();
	sum = 0;
}
class Die
{
	int numDots;
	int myX;
	int myY;
	int a;
	int b;
	int c;
	Die(int x, int y)
	{
		numDots = (int)(Math.random()*6 + 1);
		myX = x;
		myY = y;
		a = 25;
		b = 10;
		c = 40;
	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{
		noStroke();
		fill(255);
		rect(myX,myY,50,50);
		fill((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		if(numDots == 1)
		{
			ellipse(myX + a,myY + a,8,8);
		}
		else if(numDots == 2)
		{
			ellipse(myX + b,myY + b,8,8);
			ellipse(myX + c,myY + c,8,8);
		}
		else if(numDots == 3)
		{
			ellipse(myX + b,myY + b,8,8);
			ellipse(myX + a,myY + a,8,8);
			ellipse(myX + c,myY + c,8,8);
		}
		else if(numDots == 4)
		{
			ellipse(myX + b,myY + b,8,8);
			ellipse(myX + b,myY + c,8,8);
			ellipse(myX + c,myY + b,8,8);
			ellipse(myX + c,myY + c,8,8);
		}
		else if(numDots == 5)
		{
			ellipse(myX + b,myY + b,8,8);
			ellipse(myX + b,myY + c,8,8);
			ellipse(myX + c,myY + b,8,8);
			ellipse(myX + c,myY + c,8,8);
			ellipse(myX + a,myY + a,8,8);
		}
		else
		{
			ellipse(myX + b,myY + b,8,8);
			ellipse(myX + b,myY + a,8,8);
			ellipse(myX + b,myY + c,8,8);
			ellipse(myX + c,myY + b,8,8);
			ellipse(myX + c,myY + a,8,8);
			ellipse(myX + c,myY + c,8,8);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
