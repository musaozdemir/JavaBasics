package com.syntax.repl;

public class ShoppingStore {

	 String item;
	  double price;
	  int quantity;
	  
	  ShoppingStore(String item,double price,int quantity){
	    this.item=item;
	    this.price=price;
	    this.quantity=quantity;
	    
	    
	  }
	   public double itemTotalPrice(){
	    
	   
	    double totalPrice=price*quantity;
	    return totalPrice;
	 
	  }
	   
	   public static void main(String[] args) {
		
		   ShoppingStore obj1 = new ShoppingStore("Blanket", 99.98,1);

		    System.out.println(obj1.item);
	}
	}
