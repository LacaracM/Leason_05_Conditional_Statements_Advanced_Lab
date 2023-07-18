import java.util.Scanner;

public class Zadatak_004_PersonalTitles {
    //Write a console program that reads the age (a floating-point number)
    // and gender ("m" or "f") entered by the user and prints an address from the following:
    //•	"Mr." - a man (gender "m") of 16 years or more
    //•	"Master" - a boy (gender "m") under 16 years old
    //•	"Ms." – a woman (gender "f") of 16 years or more
    //•	"Miss" – a girl (gender "f") under 16 years old
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // pravimo skener jer komuniciramo sa korisnikom
        double godine = Double.parseDouble(scanner.nextLine());

        String pol = scanner.nextLine(); // f ili m -> u tom slucaju ucitavamo string

        // if (pol == "m") // == Izmedju stringova poredi ADRESU, a ne vrednost promenljivih
        // vec kada poredimo Stringove -> equals metoda
        // prvi.equals(drugi) -> ako su jednaki po vrednosti -> True
        if( pol.equals("m")) {
            // znam da je pol "m"
            if(godine >= 16) { // pitamo dalje da li su godine vece od 16
                System.out.println("Mr.");
            } else { // ako nisu vece od 16 -> onda je titula master
                System.out.println("Master");
            }

        } else if(pol.equals("f")) {
            // znam da pol nije "m" -> dalje pitam da li je pol "f"
            if( godine >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            // ako nije niti "m" niti "f"
        }
    }
}
