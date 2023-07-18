import java.util.Scanner;

public class Zadatak_001_DayOfWeek {

    //Write a program that reads an integer entered by the user
    // and prints a day of the week within [1 ... 7] or prints "Error" if the number entered is invalid.

    public static void main(String[] args) {
        int redni_broj;

        Scanner scanner = new Scanner(System.in); // pravimo skener da bi korisnik uneo vrednost

        redni_broj = Integer.parseInt(scanner.nextLine());

        switch ( redni_broj ){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // default se pise uvek na kraju svih case-ova
                // on se desava ako ne postoji poklapanje promenljive
                // sa bilo kojom vrednosti iz case-a
                System.out.println("Error");
                break;

        }
    }
}

