package cookeasi;

import java.io.IOException;
import java.util.Scanner;

public class CookEasi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CookBook cookBook = new CookBook();

        System.out.println("Enter a number between 1 and 4:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose option 1.0");
                //first, check fridge, then get a recipe from the fridge ingredients
                System.out.println(cookBook.recipeList.get(0).getDirections());
			try {
				Operator operator = new Operator();
				operator.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
