package com.calculator;
import java.util.Scanner;

import org.junit.*;

public class Calculator {
	
	public static int add(int x, int y){
	      return x + y;
	   }
	 public static int substract(int x, int y){
	      return x - y;
	   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
		int result = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("ID: 1775017");
		System.out.println("Name: ÃÖÇØÂù");
		System.out.println("1.Add two numbers\n2.Substract two numbers\n3.Multiply two numbers\n4.Quit");
		
		menu = s.nextInt();
		
		while(menu != 4)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			
			if(menu == 1){
				
				System.out.println("x:" + x);
				System.out.println("y:" + y);
				result = add(x,y); 
				System.out.println("The result is: " + result);
				
			}
			else if(menu == 2){
				System.out.println("x:" + x);
				System.out.println("y:" + y);
				result = substract(x,y);
				System.out.println("The result is " + result);
			}
			else if(menu == 3){
				System.out.println("x:" + x);
				System.out.println("y:" + y);
				System.out.println("The result is ");
			}
		
			else {
				System.exit(0);
			
			}
		}
		
		
		
	

		
	}


}
