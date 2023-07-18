import java.util.Scanner;

public class Zadatak_010_InvalidNumber {
    //A number is valid if it is in the range [100… 200] or is 0.
    // Write a program that reads an integer entered by the user
    // and print "invalid" if the number entered is not valid.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int broj = Integer.parseInt(scanner.nextLine());

        boolean isValid = broj >= 100 && broj <= 200 || broj == 0;

        if (!isValid) { // da li NIJE validan -> ! negira uslov
            System.out.println("invalid");
        }
    }
}

