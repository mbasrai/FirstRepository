package com.core;

 import com.core1.E;

public class A extends E //since it is public it can  inherit from a class within the package and  from any other package
 
{
	public void m1()
	{
		
		System.out.println("I am  m1 Class A");
	}
  public static void main(String[] args) 
  
  {
	 A a=new A();
	 a.m1();
	 a.m3();
	 
  }
}
 class B
 {
	 
	 
 }
 
 class C
 {
	 
	 
 }