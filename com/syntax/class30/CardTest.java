package com.syntax.class30;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CardTest {

	public static void main(String[] args) {
		
		ArrayList<Card> cards = new ArrayList<>();
		
		cards.add(new Visa("Visa"));
		cards.add(new Master("Master"));
		cards.add(new AE("American Express"));
		
		System.out.println(" --- Using enhance for loop ---- ");
		
		for(Card creditcard:cards) {
			creditcard.buy();
			creditcard.pay();
		}
		
		System.out.println(" --- Using regular for loop ---- ");
		
		for (int i=0; i<cards.size();i++) {
			cards.get(i).buy();
			cards.get(i).pay();
		}
		
		System.out.println(" --- Using Iterator -------------------- ");
		java.util.Iterator<Card> IT = cards.iterator();
		while(IT.hasNext()) {
			Card abc = IT.next();
			abc.buy();
			abc.pay();
		}
		
		
	}
}
