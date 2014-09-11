int sum = 0;
Die one;
void setup()
{
	size(610,610);
	noLoop();
}
void draw()
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
void mousePressed()
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
	void roll()
	{
		//your code here
	}
	void show()
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
