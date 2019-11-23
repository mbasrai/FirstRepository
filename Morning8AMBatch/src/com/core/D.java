package com.core;

  class D extends A //since not public it can only inherit from a class within the package and not from any other package

{
	  public void m2()
	  {
		  System.out.println("I am m2 from Class D");
	  }

	public static void main(String[] args)
	
	{
		D d=new D();
		d.m2();
		d.m1();
	}
}
