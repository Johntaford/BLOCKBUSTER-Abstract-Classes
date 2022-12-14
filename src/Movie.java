import java.util.ArrayList;

/*
Create an abstract Movie class with the following: 
A field for title that’s a string 
An field for runTime (in minutes) 
An array list of string called scenes
A method called printInfo() that prints all properties in the class to the 
console except for the scenes.
A method called printScenes() that prints all the scenes in the list along with their index. 
An abstract method with no return type called play() 


 */


public abstract class Movie {

	protected String title;
	protected int runTime;
	protected ArrayList<String> scenes = new ArrayList<String>();
	
	public abstract void play();
	
	
	public Movie(String title, int runTime, ArrayList<String> scenes) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getRunTime() {
		return runTime;
	}



	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}



	public ArrayList<String> getScenes() {
		return scenes;
	}



	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}



	public void printInfo() {
		System.out.println(getTitle());
		
		System.out.println(getRunTime());
	}
	
	public void printScenes() {
		System.out.println(getScenes());
	}
}
