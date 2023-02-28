package day_08;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		    
		    //Write your code here
		    Scanner scan = new Scanner(System.in);

		    String book1, book2, book3, membershipType, report;
		    double price1, price2, price3, subTotal, totalPrice;
		    boolean isMember;

		    System.out.println("Welcome to ELM store!");

		    System.out.println("Please enter book1 name and price:");
		    book1 = scan.nextLine();
		    price1 = scan.nextDouble();

		    System.out.println("Please enter book2 name and price:");
		    book2 = scan.next();
		    price2 = scan.nextDouble();
		    
		    System.out.println("Please enter book3 name and price:");
		    book3 = scan.nextLine();
		    price3 = scan.nextDouble();
		//Book1: Java - 45.5, Book2: Selenium - 25.0, Book3:SQL - 15.5, Book4: Soft Skills - 13.4
		    report = "Book1: " + book1 + " - "+price1 +
		              ", Book2 " + book2 + " - " + price2+
		              ", Book3 " + book3 + " - " + price3;
		    
		    subTotal = price1 + price2 + price3;
		    
		    System.out.println("Do you have membershib card?");
		    isMember = scan.nextBoolean();

		    
		    if (isMember){
		      System.err.println("What kind of mebership card do you have?");
		      membershipType = scan.nextLine();

		      switch (membershipType){
		        case "silver":
		          totalPrice = Math.round(subTotal - subTotal * 0.10);
		          break;
		        case "gold":
		          totalPrice = Math.round(subTotal - subTotal * 0.15);
		          break;
		        case "platinum":
		          totalPrice = Math.round(subTotal - subTotal * 0.20);
		          break;  
		         default: totalPrice = subTotal;
		         break;
		      }
		        
		    }else{
		        
		        totalPrice = subTotal;      
		    }

		    System.out.println(report);
		    System.out.println("Subtotal: $"+subTotal);
		    System.out.println("Total: $"+totalPrice);

		      
		  }
		}