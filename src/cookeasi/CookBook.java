package cookeasi;

import java.util.ArrayList;

public class CookBook {
	
	ArrayList<Recipe> recipeList;
	
	public CookBook() {
		recipeList = new ArrayList<>();
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
		
		String[] yogurtParfaitIngredients = {"greek yogurt", "fresh or frozen berries", "granola"};
		Recipe yogurtParfait = new Recipe (
				"Yogurt Parfait",
				yogurtParfaitIngredients,
				"1. Take a jar or a bowl.\n" +
                        "2. Add a layer of Greek yogurt at the bottom.\n" +
                        "3. Add a layer of fresh or frozen berries of your choice on top of the yogurt.\n" +
                        "4. Repeat the layering of yogurt and berries until the jar is full.\n" +
                        "5. Sprinkle granola on top of the final layer of yogurt.\n" +
                        "6. Serve immediately and enjoy!");
				
		recipeList.add(yogurtParfait);
		
		String[] peanutButterBananaSmoothieIngredients = {"frozen banana", "almond milk", "peanut butter", "honey"};
		Recipe peanutButterBananaSmoothie = new Recipe (	
				"Peanut Butter Banana Smoothie",
				peanutButterBananaSmoothieIngredients,
				"1. Cut a frozen banana into small pieces.\n" +
                        "2. Add the frozen banana pieces, 1/2 cup of almond milk, 1 tablespoon of peanut butter, and 1 tablespoon of honey to a blender.\n" +
                        "3. Blend all the ingredients until smooth.\n" +
                        "4. Pour the smoothie into a glass and serve immediately.\n" +
                        "5. Enjoy your delicious and healthy smoothie!");
				
		recipeList.add(peanutButterBananaSmoothie);
		
		String[] grilledChickenSaladIngredients = {"chicken breast", "salt", "pepper", "lettuce", "tomatoes", "cucumbers", "vinaigrette dressing"};
		Recipe grilledChickenSalad = new Recipe (
				"Grilled Chicken Salad",
				grilledChickenSaladIngredients,
				"1. Preheat a grill to medium-high heat.\n" +
                        "2. Season 4 chicken breast with salt, pepper, and your favorite spices.\n" +
                        "3. Place the chicken breasts on the grill and cook for 6 to 7 minutes on each side, or until the internal temperature reaches 165°F.\n" +
                        "4. Remove the chicken from the grill and let it cool for a few minutes.\n" +
                        "5. Chop the grilled chicken into bite-sized pieces.\n" +
                        "6. In a large bowl, mix together your lettuce, tomatoes, cucumbers, and a vinaigrette dressing.\n" +
                        "7. Add the chopped chicken to the salad and mix everything together.\n" +
                        "8. Serve immediately and enjoy!");
				
		recipeList.add(grilledChickenSalad);
		
		String[] veggieWrapIngredients = {"whole grain wrap", "hummus", "vegetables", "cheese", "lettuce"};
		Recipe veggieWrap = new Recipe (
				"Veggie Wrap",
				veggieWrapIngredients, 
				"1. Warm a whole grain wrap in the microwave or on a pan.\n" +
                        "2. Spread 2 tablespoons of hummus on the wrap.\n" +
                        "3. Add your favorite roasted vegetables on top of the hummus.\n" +
                        "4. Sprinkle 1/4 cup of grated cheese on top of the vegetables.\n" +
                        "5. Add a handful of lettuce on top of the cheese.\n" +
                        "6. Roll the wrap tightly and slice it in half.\n" +
                        "7. Serve immediately and enjoy your delicious veggie wrap!");
				
		recipeList.add(veggieWrap);
		
		String[] lentilSoupIngredients = {"olive oil", "onion", "carrots", "celery", "dried lentils", "vegetable broth", "tomatoes", "cumin", "paprika", "salt", "pepper"};
		Recipe lentilSoup = new Recipe (
				"Lentil Soup",
				lentilSoupIngredients,
				"1. Heat 1 tablespoon of olive oil in a large pot over medium heat.\n" +
                	"2. Add 1 diced onion, 2 chopped carrots, and 2 chopped celery stalks to the pot.\n" +
                	"3. Cook for 5 to 7 minutes, or until the vegetables are tender.\n" +
                	"4. Add 1 cup of dried lentils, 4 cups of vegetable broth, 1 can of diced tomatoes, 1 teaspoon of cumin, and 1 teaspoon of paprika to the pot.\n" +
                	"5. Bring the soup to a boil, then reduce the heat and simmer for 20 to 25 minutes, or until the lentils are tender.\n" +
                	"6. Season the soup with salt and pepper to taste.\n" +
                	"7. Serve the soup hot and enjoy!");
				
				
		recipeList.add(lentilSoup);
		
		
		String[] bakedSalmonIngredients = {"salmon", "salt", "pepper", "honey", "soy sauce", "minced garlic", "minced ginger"};
		Recipe bakedSalmon = new Recipe (
				"Baked Salmon",
				bakedSalmonIngredients, 
				"1. Preheat the oven to 375°F.\n" +
                        "2. Season 4 salmon fillets with salt, pepper, and your favorite herbs and spices.\n" +
                        "3. Place the salmon fillets in a baking dish.\n" +
                        "4. Bake the salmon for 12 to 15 minutes, or until the internal temperature reaches 145°F.\n" +
                        "5. In a small bowl, mix together 2 tablespoons of honey, 2 tablespoons of soy sauce, 1 tablespoon of minced garlic, and 1 tablespoon of minced ginger.\n" +
                        "6. Brush the honey glaze on top of the baked salmon.\n" +
                        "7. Serve the salmon hot and enjoy!");
				
		recipeList.add(bakedSalmon);
		
		String[] spaghettiBologneseIngredients = {"spaghetti", "olive oil", "onions", "carrots", "celery", "ground beef", "can of crushed tomatoes", "dried basil", "dried oregano"};
		Recipe spaghettiBolognese = new Recipe (
				"Spaghetti Bolognese",
				spaghettiBologneseIngredients,
				"1. Cook 8 ounces of spaghetti according to the package instructions.\n" +
                        "2. Heat 1 tablespoon of olive oil in a large skillet over medium-high heat.\n" +
                        "3. Add 1 diced onion, 2 chopped carrots, and 2 chopped celery stalks to the skillet.\n" +
                        "4. Cook for 5 to 7 minutes, or until the vegetables are tender.\n" +
                        "5. Add 1 pound of ground beef to the skillet and cook until browned.\n" +
                        "6. Add 1 can of crushed tomatoes, 1 teaspoon of dried basil, and 1 teaspoon of dried oregano to the skillet.\n" +
                        "7. Reduce the heat and let the sauce simmer for 15 to 20 minutes.\n" +
                        "8. Serve the spaghetti with the bolognese sauce on top.\n" +
                        "9. Enjoy your delicious spaghetti bolognese!");
				
		recipeList.add(spaghettiBolognese);
				
		String[] quinoaAndBlackBeanIngredients = {"quinoa", "black beans", "red bell peppers", "green bell pepper", "avocado", "cilantro", "olive oil", "lime juice", "cumin", "chili powder"};
		Recipe quinoaAndBlackBean = new Recipe (
				"Quinoa And Black Bean",
				quinoaAndBlackBeanIngredients,
				"1. Cook 1 cup of quinoa according to the package instructions.\n" +
                        "2. In a large bowl, mix together 1 can of black beans, 1 diced red bell pepper, 1 diced green bell pepper, 1 diced avocado, and 1/4 cup of chopped cilantro.\n" +
                        "3. Add the cooked quinoa to the bowl and mix everything together.\n" +
                        "4. In a small bowl, mix together 1 tablespoon of olive oil, 1 tablespoon of lime juice, 1 teaspoon of cumin, and 1 teaspoon of chili powder.\n" +
                        "5. Pour the dressing on top of the quinoa and black bean bowl.\n" +
                        "6. Serve the bowl hot or cold and enjoy!");
				
		recipeList.add(quinoaAndBlackBean);
			
				
	}

}
