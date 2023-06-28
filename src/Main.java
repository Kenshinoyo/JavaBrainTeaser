import java.util.Scanner;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* - Goal: Find a more DRY way to write an if else statement that checks for multiple
        * conditions, while using a scanner.
        *
        * **Ideal Solution**: Shorthand if else statement
        */


        System.out.println("Please enter a number.");
        int N = scanner.nextInt(); //<--Checks user input
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        // - Conditional statement to check against user int

        // - "Not Weird" output printed if user int is even and between 2-5, or greater than 20
        // - "Weird" output printed if user int is odd, or even and between 6-20
//      // - First Draft of code
//          if (N%2 == 0 && 2<=N && N<=5 || N%2 == 0 && 20<N) {
//            System.out.println("Not Weird");
//        } else if(N%2==0 && 6<=N && N<=20) {
//            System.out.println("Weird");
//        } else{
//            System.out.println("Weird");
//        }

        //- Possible solutions: Shorthand, switch

        //*Shorthand*
        String status = (N%2 == 0 && 2<=N && N<=5 || N%2 == 0 && 20<N) ? "Not Weird" : "Weird";
        System.out.println(status);


        scanner.close();
    }
}