package com.calculator;
import java.util.Scanner;

import org.junit.*;



public class Calculator {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
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
	
				System.out.println("The result is ");
			}
			else if(menu == 2){
				System.out.println("x:" + x);
				System.out.println("y:" + y);
				
				System.out.println("The result is ");
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
