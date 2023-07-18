import java.util.Scanner;

public class Zadatak_007_WorkingHours {

    //Write a program that reads an hour of the day (integer)
    // and a day of the week (string) - entered by the user and checks
    // whether the company's office is open, the office hours are from 10:00(10 am) to 18:00(6 pm),
    // from Monday to Saturday including.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sat = Integer.parseInt(scanner.nextLine());
        String dan = scanner.nextLine(); // ucitavamo ulazne vrednosti

        switch (dan) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                // case "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday":
                if(sat >= 10 && sat <= 18){ // izmedju 10 i 18
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            // default: -> close
            case "Sunday":
                System.out.println("closed");
                break;
        }
    }
}
