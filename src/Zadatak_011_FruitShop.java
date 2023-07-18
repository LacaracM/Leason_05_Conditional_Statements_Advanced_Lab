import java.util.Scanner;

public class Zadatak_011_FruitShop {

    //Fruit shop on weekdays works at the following prices:
    //fruit	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
    //price	2.50	1.20	 0.85	  1.45	    2.70	   5.50	     3.85

    //On Saturdays and Sundays, the store is works at higher prices:
    //fruit	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
    //price	2.70	1.25	 0.90	  1.60  	3.00	  5.60	     4.20

    //Write a program that reads from the console fruit
    // (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
    // day of the week (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday),
    // and quantity (a floating-point number), entered from the customer,
    // and calculates the sum according to the prices in the tables above.
    // In case of an invalid day of the week or invalid fruit name, print "error".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nazivVoca = scanner.nextLine();
        String nazivDana = scanner.nextLine();
        double kolicinaVoca = Double.parseDouble(scanner.nextLine());
        double cenaVoca = -1;

        if (nazivDana.equals("Saturday") || nazivDana.equals("Sunday")) {
            if (nazivVoca.equals("banana")) {
                cenaVoca = 2.7;
            } else if(nazivVoca.equals("apple")){
                cenaVoca =1.25;
            } else if(nazivVoca.equals("orange")){
                cenaVoca = 0.9;
            } else if (nazivVoca.equals("grapefruit")){
                cenaVoca = 1.6;
            } else if(nazivVoca.equals("kiwi")){
                cenaVoca = 3;
            } else if (nazivVoca.equals("pineapple")){
                cenaVoca = 5.6;
            } else if(nazivVoca.equals("grapes")){
                cenaVoca = 4.2;
            } else {
                System.out.println("error");
            }

        } else if(nazivDana.equals("Monday") || nazivDana.equals("Tuesday") || nazivDana.equals("Wednesday")
                || nazivDana.equals("Thursday") || nazivDana.equals("Friday")        ){
            if (nazivVoca.equals("banana")) {
                cenaVoca = 2.5;
            } else if(nazivVoca.equals("apple")){
                cenaVoca =1.20;
            } else if(nazivVoca.equals("orange")){
                cenaVoca = 0.85;
            } else if (nazivVoca.equals("grapefruit")){
                cenaVoca = 1.45;
            } else if(nazivVoca.equals("kiwi")){
                cenaVoca = 2.7;
            } else if (nazivVoca.equals("pineapple")){
                cenaVoca = 5.5;
            } else if(nazivVoca.equals("grapes")){
                cenaVoca = 3.85;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        if (cenaVoca != -1){ // ako cena nije -1, tj ako je doslo do promene cene u nekom od uslova
            // onda tek ispisujemo rezultat
            double ukupnaCena = cenaVoca * kolicinaVoca;
            System.out.printf("%.2f", ukupnaCena);
        }
    }
}

