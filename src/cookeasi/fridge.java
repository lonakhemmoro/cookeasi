package Fridgex;

import java.io.IOException;

public class fridge {
	private int bagSize;
	
	private int[]bagContents;
	
	private int cnt; //counter
	
	public fridge(int bagSize) {
		this.bagSize = bagSize;
		
		bagContents = new int [bagSize];
		
		cnt = 0;
		
	}
	
	public boolean addFood(int food) {    //add number to array
		
		boolean status = true;
		if (cnt < bagSize) {
		bagContents[cnt] = food;
		cnt++;
		} else {                               //tell reader if it does not work
			status = false;
		}
		
		return status;
		
	}
	
	public int getCount() { 
		return cnt;
	}
	
	public int countOccurrences(int target) {
		int occurrences = 0;
	
		
		int index;
		
		for (index = 0; index < cnt; index++) {  //tells how many occurrences there are
			if (bagContents[index] == target) {
				occurrences++;
			}
		}
		
		return occurrences;
	}
	//Precondition: The array contains at least one data item equal to target.
	//Postcondition: One instance of the target will be removed. If there is no target, the program will tell the user that there was no target found. 
	public void removeItem(int target) throws IOException{
		int occurrences = countOccurrences(target);
		int i; //index
		if(occurrences > 0) {
			i = 0;
			do {
				if(bagContents[i] == target) {
					cnt--;
					if(cnt > 1)
					bagContents[i] = bagContents[cnt];
					
					break;
				} else {
						i++;
				}
			} 		while (i < cnt);
		}  else {
				throw new IOException("no target found");
		}
	
	
	
	}
}


