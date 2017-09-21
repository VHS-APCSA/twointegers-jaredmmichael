package Twointergers;

import java.util.Scanner;

public class Twointergerrunner {
	
	public static void main(String[] args)
	{

		//h
	
	Scanner input = new Scanner(System.in);
    System.out.println("I'm hungry. Give me a number.");
    int num1 = input.nextInt();
    System.out.println("Delicious. Give me another.");
    int num2 = input.nextInt();
    /*
    System.out.println("added  " + (num1 + num2));
    System.out.println("subtracted " + (num1 - num2));
    System.out.println("multiplied " + (num1 * num2));
    System.out.println("divided " + (num1 / num2) + ", and the remainder.." + (num1 % num2));
    */
    TwoIntergers math = new TwoIntergers(num1, num2);
	
	String Arithmetic = math.arithmetic();
	System.out.println(Arithmetic);

	
	System.out.println(math.compare());
	
	System.out.println("Is " + math.getNum1() + " even? True or false.");
	System.out.println(math.even());
	
	System.out.println("Is " + num2 + " even? True or false.");
	System.out.println(math.evenTwo());
	
	System.out.println("Are " + num1 + " and " + num2 + " multiples?");
	System.out.println(math.multiple());

	
	}

}
