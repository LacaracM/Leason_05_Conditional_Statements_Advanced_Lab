import java.util.Scanner;

public class Zadatak_002_WeekendOrWorkingDay {

    //Write a program that reads the day of the week (string) - entered by the user.
    // If the day is a working day, it prints on the console - "Working day", if it is a day off - "Weekend".
    // If any text other than the day of the week is entered, print "Error".
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nazivDana = scanner.nextLine();

        switch(nazivDana){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday": // vise case-ova vezanih, za isti kod
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":// vise case-ova vezanih, za isti kod
                System.out.println("Weekend");
                break;

            default:// Ako nema poklapanja ni sa jednim case-om
                System.out.println("Error");
                break;

        }
    }
}

