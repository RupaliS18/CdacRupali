import java.util.Scanner;

public class RightTriangle_star{
       public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of lines: ");
                int s = sc.nextInt();

                //outer loop
                for(int i = 1; i<=s; i++)
                {
                        // for star
                        for(int j = 1; j<=i; j++){
                                System.out.print("* ");
                        }
                        System.out.println();
                }


       } 
}
