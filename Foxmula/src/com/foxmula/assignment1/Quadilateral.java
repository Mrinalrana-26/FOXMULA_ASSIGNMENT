/**
 * @author Mrinal Singh
 * 
 * Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral).
 * 
 * 
 *
 */
package com.foxmula.assignment1;



public class Quadilateral
{
	public double x1,x2,x3,x4,y1,y2,y3,y4;
	public  Quadilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		this.x4=x4;
		this.y4=y4;
	}
}

class Square extends Quadilateral
{
	Square(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);   
	}
	int area()
	{
		int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}

class Rectangle extends Quadilateral
{
	Rectangle(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}
class Trapezoid extends Quadilateral
{
	public double height;
	Trapezoid(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,double height)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (int)((d1+d2)*height)/2;
	}
}

class Parallelogram extends Quadilateral
{
	private double height;
	Parallelogram(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,double height)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return (int)(d1*height);
	}


	public static void main(String []args)
	{
		Square sq=new Square(10,10,20,10,20,20,10,20);
		System.out.println("Area Of The Square is " + sq.area());
		Rectangle rec=new Rectangle(10,10,30,10,30,20,10,20);
		System.out.println("Area Of The Rectangle is " + rec.area());
		Parallelogram p=new Parallelogram(10,10,30,10,20,20,0,20,8);
		System.out.println("Area Of The Parallelogram is " + p.area());
		Trapezoid t=new Trapezoid(10,10,30,10,40,20,0,20,8);
		System.out.println("Area Of The Trapezoid is " + t.area());
	}
	}

