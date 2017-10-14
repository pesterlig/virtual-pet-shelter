
public class VirtualPetShelterApp {

	public static void main(String[] args) {
		VirtualPetShelter lesliesCathouse = new VirtualPetShelter();

		VirtualPet cat1 = new VirtualPet("Wilbur", "Buff-colored", 50, 50, 50, 50.0);
		lesliesCathouse.inTake(cat1);
		VirtualPet cat2 = new VirtualPet("Charlotte", "Brown stripes", 75, 25, 50, 50.0);
		lesliesCathouse.inTake(cat2);
		System.out.println("The pets in the shelter are :" + lesliesCathouse.petsValues());
		// Details
		/// We're going to create an application that simulates you taking care of the
		// pets in a shelter.
		// Include a game loop in this project, too.
		// It should query the user,
		// then call the appropriate method(s) on VirtualPetShelter and/or VirtualPet.
		// implements a game loop.
		// asks for user input.
		// writes output to the console.
		// calls VirtualPetShelter's tick method after each interaction
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
		// VirtualPetShelterApp class
		//
		// Create a main method that…
		//
		//

	}

}
