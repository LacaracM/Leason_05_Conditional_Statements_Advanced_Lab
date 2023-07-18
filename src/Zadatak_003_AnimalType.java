import java.util.Scanner;

public class Zadatak_003_AnimalType {

    //Write a program that prints the species of the animal according to its name entered by the user.
    //•	dog -> mammal
    //•	crocodile, tortoise, snake -> reptile
    //•	others -> unknown
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
