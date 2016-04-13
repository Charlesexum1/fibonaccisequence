/*
 * fibo.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class fibo {
	
	public static void main (String args[]) {
		Scanner keys = new Scanner(System.in);
		System.out.println("fibonacci sequence generator!");
		System.out.println("type a whole number.");
		
		int capper = keys.nextInt();
				
		int x, y, z;
		x = 0;
		System.out.println(x);
		y = 1;
		System.out.println(y);
			
		for (int i = 0, total = 0 ; total < capper ; i++) {
			
			
			
			z = x + y;
			
			System.out.println(z);
			x = y + z;
			
			System.out.println(x);
			y = x + z;
			System.out.println(y);
			
			total = total + z + x + y;
			
			
		}
		
		}
}

