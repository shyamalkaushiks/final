package com.shyamal.demo;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter an integer: ");
try {
	int number = sc.nextInt();
	if(number<0)
	{
		throw new Exception("-vew not allowed");
	}

}
catch(Exception e)
{
	System.out.print("-ve mat daalo");
}

    }
}

