import java.util.Scanner;

public class Zadatak_005_SmallShop {
    //An enterprising person opens neighborhood shops in several cities and sells at different prices:
    //city / product	coffee	water	beer	sweets	peanuts
    // London	         0.50   0.80	1.20	 1.45	  1.60
    // Rome	             0.40	0.70	1.15	 1.30	  1.50
    // Paris	         0.45	0.70	1.10	 1.35	  1.55
    //Write a program that reads product (string), city (string),
    // and quantity (a floating-point number) entered by the user and calculates and prints
    // how much the corresponding quantity of the selected product costs in the specified city.
    public static void main(String[] args) {
        String nazivProizvoda;
        String grad;
        double kolicinaProizvoda;
        Scanner scanner = new Scanner(System.in); // pravimo skener
        nazivProizvoda = scanner.nextLine(); // ucitavamo podatke
        grad = scanner.nextLine();
        kolicinaProizvoda = Double.parseDouble(scanner.nextLine());

        double cena = -1; // postavili smo samo neku pocetnu vrednost za cenu

        if(grad.equals("London")) { // poredim stringove po vrednosti -> equals
            if ( nazivProizvoda.equals("coffee")){
                cena = 0.5;
            } else if(nazivProizvoda.equals("water")){
                cena = 0.8;
            } else if(nazivProizvoda.equals("beer")){
                cena = 1.2;
            } else if(nazivProizvoda.equals("sweets")){
                cena = 1.45;
            } else if(nazivProizvoda.equals("peanuts")){
                cena = 1.6;
            }
        } else if(grad.equals("Rome")){
            if ( nazivProizvoda.equals("coffee")){
                cena = 0.4;
            } else if(nazivProizvoda.equals("water")){
                cena = 0.7;
            } else if(nazivProizvoda.equals("beer")){
                cena = 1.15;
            } else if(nazivProizvoda.equals("sweets")){
                cena = 1.3;
            } else if(nazivProizvoda.equals("peanuts")){
                cena = 1.5;
            }
        }
        else if(grad.equals("Paris")){
            if ( nazivProizvoda.equals("coffee")){
                cena = 0.45;
            } else if(nazivProizvoda.equals("water")){
                cena = 0.7;
            } else if(nazivProizvoda.equals("beer")){
                cena = 1.10;
            } else if(nazivProizvoda.equals("sweets")){
                cena = 1.35;
            } else if(nazivProizvoda.equals("peanuts")){
                cena = 1.55;
            }
        }

        double ukupnaCena = cena * kolicinaProizvoda;
        System.out.println(ukupnaCena);
    }
}
