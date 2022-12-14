import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int choice;
			String answer = "yes";

			ArrayList<String> HappeningScene = new ArrayList<>(Arrays.asList("Happening"));
			ArrayList<String> TILLScene = new ArrayList<>(Arrays.asList("TILL"));
			ArrayList<String> TheDukeScene = new ArrayList<>(Arrays.asList("The Duke"));
			ArrayList<String> RepeaterScene = new ArrayList<>(Arrays.asList("Repeater"));
			ArrayList<String> AfterSunScene = new ArrayList<>(Arrays.asList("Aftersun"));
			ArrayList<String> EOScene = new ArrayList<>(Arrays.asList("EO"));

			ArrayList<Movie> movie = new ArrayList<>();
			movie.add(new VHS("Happening", 100, HappeningScene));
			movie.add(new VHS("TILL", 130, TILLScene));
			movie.add(new VHS("The Duke", 96, TheDukeScene));
			movie.add(new DVD("Reapeater", 106, RepeaterScene));
			movie.add(new DVD("Aftersun", 101, AfterSunScene));
			movie.add(new DVD("EO", 88, EOScene));

			do {
				printMenu();
				choice = scan.nextInt();

				if (choice == 1) {
					movie.get(choice).play();
				} else if (choice == 2) {
					movie.get(choice - 1).play();
				} else if (choice == 3) {
					movie.get(choice - 1).play();
				} else if (choice == 4) {
					movie.get(choice - 1).play();
				} else if (choice == 5) {
					movie.get(choice - 1).play();
				} else if (choice == 6) {
					movie.get(choice - 1).play();
				}
				if (choice > 0 && choice <= 3) {
					System.out.println("Thank you for selecting a VHS");
				} else {
					System.out.println("Thank you for selecting DVD");
				}

				System.out.println("Would you like to choose another movie? (y/n): ");
				answer = scan.next();
				System.out.println();
			} while (answer.equalsIgnoreCase("y"));
		}

		System.out.println("Thank you");
	}

	public static void printMenu() {
		System.out.println("Hello! Please select a movie!");
		System.out.println("1. Happening");
		System.out.println("2. Till");
		System.out.println("3. The Duke");
		System.out.println("4. Repeater");
		System.out.println("5. Aftersun");
		System.out.println("6. EO");
		System.out.print("Which movie would you like? (1-6): ");
	}
}
