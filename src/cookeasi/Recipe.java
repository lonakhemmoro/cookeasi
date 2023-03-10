package cookeasi;

public class Recipe {
	
	private String name;
	private String[] ingredients;
	private String directions;
	
	public Recipe (String name, String[] ingredients, String directions) {
		this.name = name;
		this.ingredients = ingredients;
		this.directions = directions;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getIngredients(){
		return ingredients;
	}
	
	public String getDirections() {
		return directions;
	}
}
