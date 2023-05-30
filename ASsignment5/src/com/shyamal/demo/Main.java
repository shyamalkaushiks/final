package com.shyamal.demo;


import java.util.Scanner;

abstract  class Hello
{
	public abstract void a();
	
}
interface c
{
	public void a();
}
class b extends Hello
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.print("a");
	}
	
}
class d implements c
{

	@Override
	public void a() {
		System.out.print("a from interface");
	return;	
	}

	
}

public class Main {
    public static void main(String[] args) {
  b H=new b();
  d e=new d();
  e.a();
  H.a();
    }
}
