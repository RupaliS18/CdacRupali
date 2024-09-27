import java.util.Scanner;

public class Prime_no{
	static int number;
	static boolean flag = false;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void primeNumOrnot(){
		if(number == 0 || number == 1){
			System.out.println("It's not a prime number");
		}
		else if(number == 2)
			System.out.println("It's a prime number");
		else{
			for(int i = 2; i < number; i++){
				if ((number % i)== 0){
					flag = false;
					break;
				}
				else
					flag = true;
			}
		
			if (flag == true)
				System.out.println("It's a prime number");
			else
				System.out.println("It's not a prime number");
		}
	}
	
	public static void main(String args[]){
		System.out.println("Enter any number: ");
		number = sc.nextInt();

		primeNumOrnot();
	}
}