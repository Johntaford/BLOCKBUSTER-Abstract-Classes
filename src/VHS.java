import java.util.ArrayList;
/*
 * Next Create a child class of Movie called VHS and code the following:
A field called currentTime which will start at 0 and match up with the indexes of the arraylist of scenes 
An override of play() that "plays" (prints out) the scene at the current time and then increments currentTime. If currentTime is greater than the max index of the array list, call rewind()
A method called rewind() that returns nothing and sets currentTime to 0. 
 */

public class VHS  extends Movie{
	
	 private int currentTime = 0;

	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		
	}
	

	public int getCurrenttime() {
		return currentTime;
	}
	
	public void rewind() {
		this.currentTime = 0;
	}


	@Override
	public void play() {
		if(currentTime < getScenes().size()) {
			System.out.println(getScenes());
		} else if (currentTime >= getScenes().size()) {
			rewind();
			
		}
		
	}

}
