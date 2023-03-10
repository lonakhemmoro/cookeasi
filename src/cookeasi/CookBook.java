package cookeasi;

import java.util.ArrayList;

public class CookBook {
	
	ArrayList<Recipe> recipeList;
	
	public CookBook() {
		initRecipeList();
	}
	
	public void initRecipeList() {
		String[] avocadoToastIngredients = {"toast", "avocado", "salt", "pepper", "red pepper flakes"};
		Recipe avocadoToast = new Recipe (
				"Avocado Toast",
				avocadoToastIngredients, 
				"1. Toast 2 slices of whole grain bread to your desired level of doneness.\n" +
                        "2. Cut an avocado in half, remove the pit and mash the flesh with a fork.\n" +
                        "3. Spread the mashed avocado onto the toasted bread.\n" +
                        "4. Sprinkle salt, pepper, and red pepper flakes on top of the avocado toast.\n" +
                        "5. Serve immediately and enjoy!");
		
		recipeList.add(avocadoToast);
	}

}
