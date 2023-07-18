import java.util.Scanner;

public class Zadatak_008_CinemaTicket {

    //Write a program that reads the day of the week (string) - entered by the user
    // and prints on the console the price of a movie ticket according to the day of the week:
    //Monday	Tuesday	Wednesday	Thursday	Friday	Saturday	Sunday
    //  12	        12	    14	        14	        12	    16	        16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nazivDana = scanner.nextLine();

        int cenaKarte = -1;

        if (nazivDana.equals("Monday") || nazivDana.equals("Tuesday") || nazivDana.equals("Friday")){
            cenaKarte = 12;
        }else if (nazivDana.equals("Wednesday") || nazivDana.equals("Thursday")){
            cenaKarte = 14;
        }else if (nazivDana.equals("Saturday")  || nazivDana.equals("Sunday")){
            cenaKarte = 16;
        }
        System.out.println(cenaKarte);
    }
}

