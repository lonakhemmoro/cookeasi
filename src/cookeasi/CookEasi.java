package cookeasi;

import java.util.Scanner;

public class CookEasi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 4:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            	//this is the test for the recipe name, havent figured out how to connect the interface yet!
            	testRecipe.testRecipe();
                break;
            case 2:
                System.out.println("You chose option 2");
                break;
            case 3:
                System.out.println("You chose option 3");
                break;
            case 4:
                System.out.println("You chose option 4");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

}