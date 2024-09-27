import java.util.Scanner;

public class Factorial{
	static Scanner sc = new Scanner(System.in);
	static int num;
	static int fact = 1;
	
	static void factorial()
	{
		for(int i = num; i>0; i--)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of "+ num +" is : " + fact);
	}
	
	public static void main(String args[]){
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		
		factorial();
	}
}