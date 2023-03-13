package FridgeOperator;
	import java.io.IOException;

	import Fridgex.fridge;

	public class Operator {
		
		public static void main(String[] args) throws IOException {
			//TODO Auto generated method sub
			System.out.println(" I am a bag operator");
			
			fridge x = new fridge(10);
			
			x.addFood(6);
			
			x.addFood(9);
			
			x.addFood(8);
			
			x.addFood(9);
			
			x.addFood(10);
			
			x.addFood(5);
			
			x.addFood(8);
			
			x.addFood(8);
			
			x.addFood(8);
			
			
			System.out.println("The amount of ingredient 8 is: " + x.countOccurrences(8));
			
			System.out.println("The amount of ingredients inside of the fridge is: " +x.getCount());
			
			x.removeItem(8);
			System.out.println("1 occurrence of ingredient 8 has been deleted. There are now " + x.countOccurrences(8) +" left");
		}
		}
