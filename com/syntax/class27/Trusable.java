package com.syntax.class27;

abstract class Mortgage{
	
	protected abstract void giveMortgage(); // we can do all return tyop expect priviate. we need to be available to other(child) class
}



public interface Trusable {
	
	void trust();

}

interface Bank extends Trusable{
	
	void deposit();
	void withdraw();

}





interface Investments {
	
	void doInvestments();
	
}






 class PNC extends Mortgage implements Bank , Investments{
// PNC class can have only 1 parants( class and can have many interface.
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}
	
	public void withdraw() {
		System.out.println("PNC bank do withdraw");
	}

	public void trust(){
		System.out.println("you can trust PNC bank");
		
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortgge");
		
	}
	
	public void doInvestments() {
		System.out.println("you can invest your money with PNC");
	}
	
	
 }
	
	class BOA implements Bank , Investments{
		// PNC class can have only 1 parants( class and can have many interface.
			public void deposit() {
				System.out.println("PNC bank takes deposits");
			}
			
			public void withdraw() {
				System.out.println("PNC bank do withdraw");
			}

			public void trust(){
				System.out.println("you can trust PNC bank");
				
			}
			
			public void givesLoan() {
				System.out.println("PNC gives mortgge");
				
			}
			
			public void doInvestments() {
				System.out.println("you can invest your money with PNC");
			}
	
}
 


