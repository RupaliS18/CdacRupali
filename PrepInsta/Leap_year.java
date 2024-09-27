import java.util.Scanner;

public class Leap_year{
	static int year;
	
	static Scanner sc = new Scanner(System.in);

	public static void leapyearornot(){
		if( (year % 4 )==0)
			System.out.println("It's a leap year");
		else
			System.out.println("It's not a leap year");
	}
	
	public static void main(String args[]){
		System.out.println("Enter any year: ");
		year = sc.nextInt();

		leapyearornot();
	}
}