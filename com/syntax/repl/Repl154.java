package com.syntax.repl;

public class Repl154 {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		Child child1 = new Child(10);
		
		C c = new C();
		
		BB b = new BB();
		b.display();
		b.display1();
	}
}








class AA{
	  
	   int ik=10;
	  
	  AA (){
		  
		  }
	  
	  void display1(){
		
	    System.out.println(ik);
	    
	    
	  }
	  
	}


class BB extends AA{
	  
	
	  int i=20;
	
	  BB (){
		    super();
		  }
	  
	   void display(){
	    System.out.println(super.ik);
	}
	   
}
	   
	   
	   
	   
	   
	   
	   
	   
	   





class A{
	  
	  public A(){
	    System.out.println("I");
	  }
	}
class B extends A{
	  
	  public B(){
	    super();
	    System.out.println("am");
	  }
	}

class C extends B{
	  
	  public C(){
	    super();
	    System.out.println("a tester");
	  }
	}
















class Parent{
	  
	  public Parent(){
	    System.out.println("Parent Constructor without argument");
	  }
	  
	   public Parent(int number){
	   
	    System.out.println(number);
	  }
	  
	  
	}


class Child extends Parent{
	  
	 Child(){
	     super();
	    System.out.println("Child Constructor without argument");
	  }
	  
	  Child(int number1){
	    super(number1);
	  }
	  
}
	






