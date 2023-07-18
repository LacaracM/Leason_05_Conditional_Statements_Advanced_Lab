import java.util.Scanner;

public class Zadatak_012_TradeCommissions {

    //The company gives the following commissions to its merchants according to the city
    // in which they operate and the volume of sales:
    //City	    0 ≤ s ≤ 500 	500 < s ≤ 1 000 	1 000 < s ≤ 10 000  	s > 10 000
    //London	    5%	                7%                 	8%	                12%
    //Paris     	4.5%	            7.5%	            10%	                13%
    //Rome	        5.5%	            8%	                12%	                14.5%
    //Write a console program that reads the city name (string) and sales volume (a floating-point number)
    // entered by the user and calculates the percentage of the trade commission according to the table above.
    // Display the result formatted to 2 digits after the decimal point.
    // In case of invalid city or sales volume (negative number) print "error".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        // provera da li nije dobar unos za grad
        boolean isValidCity = city.equals("London") || city.equals("Rome") || city.equals("Paris");
        if( !isValidCity ){
            System.out.println("error");
            return;
        }
        // provera da li nije dobar unos za salesVolume
        if (salesVolume < 0) {
            System.out.println("error");
            return; // return nam prekida izvrsavanje same main metode
            // i nakon nje prestaje dalji tok programa
        }
        double bonus = -1; // -1 jer znamo da ako ostane -1 -> doslo je do neke greske
        if (city.equals("London")){
            if (salesVolume <= 500){
                bonus = 5;
            } else if (salesVolume <= 1000){
                bonus = 7;
            } else if(salesVolume <= 10000){
                bonus = 8;
            } else {
                bonus =12;
            }
        } else if (city.equals("Paris")){
            if (salesVolume <= 500){
                bonus = 4.5;
            } else if (salesVolume <= 1000){
                bonus = 7.5;
            } else if(salesVolume <= 10000){
                bonus = 10;
            } else {
                bonus =13;
            }
        } else if (city.equals("Rome")){
            if (salesVolume <= 500){
                bonus = 5.5;
            } else if (salesVolume <= 1000){
                bonus = 8;
            } else if(salesVolume <= 10000){
                bonus = 12;
            } else {
                bonus =14.5;
            }
        }
        double ukupanBonus = salesVolume * bonus / 100;
        System.out.printf("%.2f", ukupanBonus);
    }
}

