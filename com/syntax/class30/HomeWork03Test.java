package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;




public class HomeWork03Test {
	
	public static void main(String[] args) {
		
		ArrayList<Insurance> insurances = new ArrayList<>();
		
		insurances.add(new Car("Geigo","Tesla"));
		insurances.add(new Pet("infinity","Persian cat"));
		insurances.add(new Health("oscar"));

		System.out.println(" --- Using regular for loop ---- ");
		
		for( int i=0; i<insurances.size(); i++ ) {
			insurances.get(i).getQuote();
			insurances.get(i).cancelInsurance();
		}
		
		System.out.println(" --- Using enhance for loop ---- ");
		
		for(Insurance insurance:insurances) {
			insurance.getQuote();
			insurance.cancelInsurance();
			
		}
		
		System.out.println(" --- Using Iterator -------------------- ");
		
		Iterator<Insurance> it=insurances.iterator();
		while(it.hasNext()) {
			Insurance ins = it.next();
			ins.cancelInsurance();
			ins.getQuote();
		}
		
		
		
	}

}
