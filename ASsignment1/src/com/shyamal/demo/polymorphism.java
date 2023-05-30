package com.shyamal.demo;
import java.util.*;

 interface shape
{
	public void input();
	public void compute();
	public void display();
	
}
 
  class circle implements shape
 {
public Float radius;
public Float permiter;
public Float area;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
		  System.out.println("please enter the radius of circle");
		  radius=scan.nextFloat();
		
	}

	@Override
	public void compute() {
		// TODO Auto-generated method stub
		permiter=(float) (radius*2*3.14);
		area=(float) (radius*radius*3.14);
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("area is "+area);
		// TODO Auto-generated method stub
				System.out.print("perimaeter is "+permiter);
	}
	 
 }
  class triangles implements shape
  {
	  public Float base;
	  public Float height;
	  public Float area;
	  
	  @Override
	  public void input()
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("please enter the base of traiangle");
		  base=scan.nextFloat();  
		  System.out.println("please enter the height of traiangle");
		  height=scan.nextFloat(); 
	  }
  @Override
	  public void compute()
	  {
	  area=(float) (.5*base*height);
	  }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("the area of traingle is"+area);
	}
	  
  }
  
  
  class Geometry
  {
  public void permit(shape s)
  	{
  		s.input();
  		s.compute();
  		s.display();
  	}
  }
public class polymorphism {

	
	public static void main(String args[])
	{
		shape c=new circle();
		shape t=new triangles();
		Geometry g=new Geometry();
		g.permit(c);
		g.permit(t);
		
	}
	
}

