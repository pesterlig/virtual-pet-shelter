import java.util.Scanner;

public class ClientVirtualPetShelterApp {

	public static void main(String[] args) {
		ShelterVirtualPet lesliesCathouse = new ShelterVirtualPet();
		Scanner input = new Scanner(System.in);

		CatVirtualPet cat1 = new CatVirtualPet("Finnie", "ginger-striped American shorthair", 0, 100, 100, 100.0);
		lesliesCathouse.inTake(cat1);
		CatVirtualPet cat2 = new CatVirtualPet("Foggy", "kick-ass cat", 50, 50, 50, 50.0);
		lesliesCathouse.inTake(cat2);
		System.out.println("Welcome to Leslie's Cat House!");
		System.out.println("There are " + lesliesCathouse.getNumberOfPetsInShelter() + " cats in the shelter today.");

		// displayShelterMenu();

		// System.out.println("The pets in the shelter are :" +
		// lesliesCathouse.petsValues());

		// String choice = input.nextLine();
		String choice = "0";
		// Game Loop:
		while (choice != "q" || choice == "0") {
			// lesliesCathouse.showAllPetsValuesTable();
			displayShelterMenu();
			choice = input.nextLine();

			if (choice.contains("1")) {
				System.out.println("\nHey! Ho!  Let's Go!  \nCheck out all our awesome cats below:\n");
				displayAsciiKitten();
				lesliesCathouse.showAllPetsValuesInSentences();
				System.out.println("Please choose the kitty you would like to play with!\n");
				String catPlayChoice = input.nextLine();
				lesliesCathouse.playWithOnePetByName(catPlayChoice);
				System.out.println(catPlayChoice + " is much happier now!\n");
				lesliesCathouse.showAllPetsValuesTable();
				// Show names and descriptions, play with cat, show specific cat's values, print
				// a line about playing with the cat
			} else if (choice.contains("2")) {
				// Show list of cats, get cat by name, remove cat
				lesliesCathouse.showAllPetsValuesInSentences();
				System.out.println("Please enter the name of the cat you would like to adopt!\n");
				String adoptionChoice = input.nextLine();
				lesliesCathouse.adopt(adoptionChoice);// take care of different case match-up
				System.out.println("Thank you for adopting " + adoptionChoice + "!\n");
				// once you adopt a cat, are you back in virtual pet mode???? Good idea, but
				// seems beyond the scope now
			} else if (choice.contains("3")) {
				lesliesCathouse.feedAllPets();
				System.out.println("Thank you for feeding all the kitties!!!  Their hunger has decreased! \n");
				lesliesCathouse.showAllPetsValuesTable();
			} else if (choice.contains("4")) {
				lesliesCathouse.waterAllPets();
				System.out.println("Thank you for giving all the cats fresh water!  They are healthier now!\n");
				lesliesCathouse.showAllPetsValuesTable();
			} else if (choice.contains("5")) {
				System.out.println("So, you want to drop off a kitten.  What is the kitten's name?");
				String nameAtIntake = input.nextLine();
				// IDEA - take in all these kittens as array list, get index numbers on them as
				// they appear,
				// create the map using the indexes as keys & eliminate the case problem? Or
				// create more problems?
				System.out.println("Please describe your cat for the record:");

				String descriptionAtIntake = input.nextLine();
				CatVirtualPet cat3 = new CatVirtualPet(nameAtIntake, descriptionAtIntake);
				lesliesCathouse.inTake(cat3);
				System.out.println("Thank you for bringing in " + nameAtIntake + "!");
				System.out.println(
						"There are " + lesliesCathouse.getNumberOfPetsInShelter() + " cats in the shelter now.");
				lesliesCathouse.showAllPetsValuesInSentences();

				// set description, set name? Or call new constructor on this kitten?
			} else if (choice.contains("q")) {
				System.out.println("Thank you for visiting!");
				System.out.println("Game Over");
				System.exit(0);

			} else
				System.out.println("That was not a valid choice");
		}
		lesliesCathouse.tickAllPets();

	}

	

	public static void displayShelterMenu() {
		System.out.println("What would you like to do? (Input number of choice)");
		System.out.println(" 1 = Play with a kitty");
		System.out.println(" 2 = Adopt a kitty");
		System.out.println(" 3 = Volunteer to feed all the cats");
		System.out.println(" 4 = Volunteer to give all the cats fresh water");
		System.out.println(" 5 = Admit a cat to the shelter");
		System.out.println(" Leave the Leslie's Cat House (Type q to quit)");
	}

	public static void displayAsciiKitten() {
		char backSlash = '\\';
		System.out.println("	    /|");
		System.out.println("	  =(o  ` 7");
		System.out.println("	     ` o =");
		System.out.println("	   /   `" + backSlash);
		System.out.println("	   U U\n");

	}

}

//
// System.out.println("You just found a kitten!\n");
// cat1.displayAsciiKitten();
// System.out.println("Name your kitty:");
// cat1.setName(input.nextLine());
// String name = cat1.getName();
// System.out.println(name + " is the perfect name for this cat!\n");
//
// // Game Loop:
// while (cat1.getContentment() > 0) {
// cat1.tick();
//
// if (cat1.getContentment() >= 75) {
// System.out.println(name + " is mostly content now ");
// } else if (cat1.getContentment() >= 50 && cat1.getContentment() < 75) {
// System.out.println(name + " could be happier...");
// } else if (cat1.getContentment() < 50 && cat1.getContentment() > 0) {
// System.out.println(name + " is discontent!");
// }
//
// System.out.println(name + " is\n" + cat1.getHunger() + "% hungry \n" +
// cat1.getHealth()
// + "% fit & healthy\n" + cat1.getHappiness() + "% happy\n");
//
// cat1.displayMenu(name);
//
//
// }
//
// System.out.println(name + " has run away!");
// System.out.println("Game Over");
// System.exit(0);
// }

// Details
/// We're going to create an application that simulates you taking care of the
// pets in a shelter.
// Include a game loop in this project, too.
// It should query the user,
// then call the appropriate method(s) on ShelterVirtualPet and/or
// CatVirtualPet.
// implements a game loop.
// asks for user input.
// writes output to the console.
// calls ShelterVirtualPet's tick method after each interaction
// Available user interface actions should include (at minimum)…
//
// feeding all the pets
// watering all the pets
// playing with an individual pet, which should display a list of pet names and
// descriptions, allowing a user to select one
// allow adoption of a pet, which should display a list of pet names and
// descriptions, allowing a user to select one
// allow intake of a pet, prompting the user for the pet's information,
// requiring the user to (at minimum) specify name and description
// (Hint: you can use tab characters ("\t") to align console output in columns.)

// Example Interactions
//
// Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!
//
// This is the status of your pets:
//
// Name |Hunger |Thirst |Boredom
// --------|-------|-------|-------
// Joey |83 |34 |23
// Johnny |69 |49 |2
// Dee Dee |39 |18 |88
// Tommy |59 |19 |37
//
// What would you like to do next?
//
// 1. Feed the pets
// 2. Water the pets
// 3. Play with a pet
// 4. Adopt a pet
// 5. Admit a pet
// 6. Quit
// Example Pet Selection Interaction
//
// Ok, so you'd like to play with a pet. Please choose one:
//
// [Joey] looks like he's seen better days.
// [Johnny] is a bit nervous.
// [Dee Dee] probably didn't start with that many legs.
// [Tommy] smells like a Stargazer lily fresh with morning dew.
//
// Which pet would you like to play with?
// Tommy
//
// Ok, you play with Tommy.
// Required Tasks
//
// ClientVirtualPetShelterApp class
//
// Create a main method that…
//
//
