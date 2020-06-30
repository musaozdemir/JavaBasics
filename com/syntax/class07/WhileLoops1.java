package com.syntax.class07;

public class WhileLoops1 {

	public static void main(String[] args) {
		
//		 while ile 1 den 50 ye kadar yazdirmak.
		
		int num = 1;
		
		while (num <= 50) {
			
			System.out.println(num);
			
			num++;
		}
		
		System.out.println("-------------------------------");
		
		
		int x = 20;
		
		while (x <= 30) {
			
			System.out.println(x);
			
			x++;
		}
		
		System.out.println("-------------------------------");
		
		int z = 5;
		
		while (z<=15) {
			
			System.out.print(z + " - ");
			z++;
			
		}
		
		System.out.println("");
		System.out.println("/////./////");
		

		int t = 10;
		
		while (t >= 1) {
			
			System.out.println(t);
			t--;
			}
		
		
		System.out.println("");
		System.out.println("/////./////");
		

		int k = 50;
		
		while (k >= 1) {
			
			System.out.println(k);
			k--;
			
			}
		
		
		System.out.println("----------------");
		
		
		int d = 1;
		
		while (d <= 20) {
			
			System.out.print(d + " ");
			d += 2;
			}
		
		System.out.println("");
		System.out.println("--------");
		
		int y = 1;
		
		while(y <= 20) {
			if (y%2 == 1) {
				System.out.print(y + " ");
			}
			y++;
		 }
		
		
		
		System.out.println("");
		System.out.println("--------");
		
		int f = 1;
		
		while(f <= 20) {
			if (f%2!=0) {
				System.out.print(f + " ");
			}
			f++;
		 }
		
		
		
	}
}
