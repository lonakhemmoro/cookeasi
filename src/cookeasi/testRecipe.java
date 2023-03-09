package cookeasi;

public class testRecipe extends Cookbook {
private String getIngredients;

static String Name;
static String Ingredient;
static String Directions;

	public static String getDirections() {
		return Directions =  "This is the test for directions, please be aware of where the directions go within the code";
	}


	public static String getIngredients() {
		return Ingredient = "Ingredients list, might need to make these something different than a simple string";
		
	}

	public static String getRecipeName() {
		return Name = "Test";
	}
	
	public static void testRecipe() {
		System.out.println(getRecipeName()+ getDirections() + getIngredients());
		
	}
}
