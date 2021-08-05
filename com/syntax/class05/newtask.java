package com.syntax.class05;

import java.util.Scanner;

public class newtask {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String item;
		int price=0;
		int payment=0;
		int total=0;
		int balance=0;
		int change=0;
		
		System.out.println("what you wnat to buy");
		item = scan.nextLine();
		System.out.println("price of the item");
		price=scan.nextInt();
		
		System.out.println("please enter the amount you want to pay");
		do {
			
			payment=scan.nextInt();
			total+=payment;
			
			if(total>price) {
				change=total-price;
				System.out.println("ypur change "+change);
				break;
			}  else if(payment<price) {
				balance=price-total;
				System.out.println("still need to pay "+change);
			}
			
			
		} while(total!=price);
		
			System.out.println("thanks for shopping");
			System.out.println(price+" "+ payment+" "+change);
		
		
		
		
	}

}
