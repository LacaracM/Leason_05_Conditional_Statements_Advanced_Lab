import java.util.Scanner;

public class Zadatak_009_FruitOrVegetable {
    //Write a program that reads a product name entered by the user and checks if it is a fruit or vegetable.
    //•	The fruits are banana, apple, kiwi, cherry, lemon, and grapes
    //•	The vegetables "vegetable" are tomato, cucumber, pepper, and carrot
    //•	Everything else is "unknown"
    //Print "fruit", "vegetable" or "unknown" depending to the introduced product.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String all = scanner.nextLine();

        switch (all){

            case "banana":
            case "lemon":
            case "kiwi":
            case "cherry":
            case "grapes":
            case "apple":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
