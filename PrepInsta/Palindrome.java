import java.util.Scanner;

public class Palindrome{
	static Scanner sc = new Scanner(System.in);

	static int n = 0;
	static int l, a;
	static int rev= 0;
	
	public static void palindrome(){
		a = n;
		while (n != 0) {
			l = n % 10;
			rev = (rev * 10) + l;
			n = n / 10;
		}

		if(rev == a)
		{
			System.out.println("The num is Palindrome");
		}
		else
			System.out.println("The num is not Palindrome");
	}
	
	public static void main(String args[]){
		System.out.println("Enter any number: ");
		n = sc.nextInt();

		palindrome();
	}
}