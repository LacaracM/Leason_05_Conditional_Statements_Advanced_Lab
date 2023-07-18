import java.util.Scanner;

public class Zadatak_006_NumberInRange {

    //Write a program that checks if the number entered by the user
    // is in the range [-100, 100] and is different from 0 and print "Yes" if it meets the conditions,
    // or "No" if it is outside the range.
    public static void main(String[] args) {

        int broj;

        Scanner scanner = new Scanner(System.in);

        broj = Integer.parseInt(scanner.nextLine());

        if( broj >= -100 && broj <= 100 && broj != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

