import java.util.Scanner;

class sqrtt{
	static int n = 0;
	
	static void enternum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n = sc.nextInt();
	}
	static int square(){
		int sqr_root = n * n;
		return sqr_root;
	}
}
public class Square_root{	
public static void main(String args[]){
	
	    sqrtt s = new sqrtt();
		s.enternum();
		System.out.println(s.square());
	}
}