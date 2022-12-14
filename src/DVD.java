import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{

	Scanner scan = new Scanner(System.in);
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		ArrayList<String> scenes = super.getScenes();
		System.out.println("What Scene would you like to watch?");
		super.printScenes();
		int choice = scan.nextInt();
		
		System.out.println("Scene " + choice + ": " + scenes.get(choice));
		
	}

}
