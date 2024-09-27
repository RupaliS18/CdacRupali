import java.util.Scanner;

public class Fibonacci {
        static Scanner sc = new Scanner(System.in);

        static int fib1 = 0;
	static int fib2 = 1 ;
	static int fib3;
        static int limit;
        static int count = 0;

        static void fibo(){
                System.out.println("Fibonacci series starts: \n" +fib1);
                System.out.println(fib2);

                while( count < limit){
                        fib3 = fib1 + fib2;
                        count++;
                        System.out.println(fib3);
                        fib1 = fib2;
                        fib2 = fib3;
                }
        }
       
        public static void main(String[] args) {
                System.out.println("Enter limit: ");
		limit = sc.nextInt();

		fibo();
        }
}
