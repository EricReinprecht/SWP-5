/**
 * @author Eric Reinprecht
 * <p>
 * created on 30.09.2022
 */

import java.util.Scanner;


public class Osterformel {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter year");

        int J = inputYear.nextInt();  // Read user input

        int N = J - 1900;
        int A = N % 19;
        int B = (7 * A +1) / 19;
        int M = (11 * A + 4 - B) % 29;
        int Q = N/4;
        int W = (N + Q + 31 - M) % 7;
        int P = 25 - M - W;

        if(P>0){
            System.out.println("Ostersonntag ist der " + P + ". " + "April");
        }

        else{
            System.out.println("Ostersonntag ist der " + P + 31 + ". " + "März");
        }


    }
}

