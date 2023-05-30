package com.shyamal.demo;
import java.util.*;

public class Main {
	public static List number=new ArrayList<>();
	
    public static void main(String[] args) {
      
      
      System.out.print("enter no");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<=5;i++)
      {
    	  int n=sc.nextInt();
    	  number.add(n);
      }

      System.out.print("going to logix ");
    	  int a=Main.SecondLarget(number);
     	  int b=Main.FirstLargest(number);
     	  System.out.println("second"+a+"first"+b);
      }
    
      
    
public static int SecondLarget(List l)
	{
		Collections.sort(l);
		return (int) l.get(l.size()-2);
	}
public static int FirstLargest(List l)

{
	Collections.sort(l);
	return (int) l.get(l.size()-1);
}
}