/**
 * @author Eric Reinprecht
 * <p>
 * created on 10.11.2022
 */

import java.util.Scanner;

public class addieren {
    public static void main(String[] args) {
        new addieren().top();
    }

    void top() {

        String number1 = read("erste Zahl");
        String number2 = read("zweite Zahl");
        String sum = addUp(number1, number2);
        if (sum.length() > 1 && sum.charAt(0) == '0') {
            sum = sum.substring(1);
        }
        System.out.println("Summe = " + sum);
    }

    Scanner sc = new Scanner(System.in);

    String read(String input) {
        System.out.println("Bitte " + input + " eingeben: ");
        return sc.nextLine().trim();
    }

    String addUp(String a, String b) {
        String result = "";
        int numberLength = Math.max(a.length(), b.length());
        int leftover = 0;
        int position = 1;
        while (position <= numberLength + 1) {
            int number1 = numeral(a, position);
            int number2 = numeral(b, position);
            int sum = number1 + number2 + leftover;
            if (sum > 9) {
                leftover = sum / 10;
                sum = sum % 10;
            } else {
                leftover = 0;
            }
            result = numeral(sum) + result;
            position = position + 1;
        }
        return result;
    }


    int numeral(String numberString, int spot) {
        int pos = numberString.length() - spot;
        if (pos < 0) {
            return 0;
        }
        return numberString.charAt(pos) - '0';
    }


    String numeral(int number) {
        if (number < 1) return "0";
        if (number > 9) return "X";
        return "" + number;
    }

}
