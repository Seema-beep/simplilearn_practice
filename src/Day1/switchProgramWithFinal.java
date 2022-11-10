package Day1;

import java.util.Scanner;

public class switchProgramWithFinal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a choice");
		int ch=sc.nextInt();
		final int x=2;//since final it is treared as constant
		switch(ch)
		{
		case 1:
			System.out.println("apple");
			break;
			
		case x:
			System.out.println("banana");
			break;
			
		case 3:
			System.out.println("watermelon");
			break;
			
		case 4:
			System.out.println("papaya");
			break;
			default:
				System.out.println("Invalid choice");
		}

	}

}
