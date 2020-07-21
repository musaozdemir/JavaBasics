package com.syntax.repl;

public class StoreProduct {

	String label;
	  double price;
	  String category;
	  boolean hasExpiration;
	  int stock;
	  
	  public StoreProduct(String label,  double price, String category, boolean hasExpiration, int stock){
	    
	    this.label=label;
	    this.price=price;
	    this.category=category;
	    this.hasExpiration=hasExpiration;
	    this.stock=stock;
	  }
	  
	 public StoreProduct(String label,  double price, int stock){
	    
	    this.label=label;
	    this.price=price;
	    category="misc";
	    hasExpiration=false;
	    this.stock=stock;
	  }
	  
	  public StoreProduct(String label,  double price ){
	    
	    this.label=label;
	    this.price=price;
	    stock=0;
	  }
	  
	  public void displayy(String label,  double price, String category, boolean hasExpiration, int stock){
	    
	    System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	    
	  }
	}
