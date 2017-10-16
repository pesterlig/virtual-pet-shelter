import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShelterVirtualPet {
	// ShelterVirtualPet class
	//
	// include appropriate instance variable(s) to store the pets who reside at the
	// shelter
	private Map<String, CatVirtualPet> pets = new HashMap<String, CatVirtualPet>();

	// return a Collection of all of the pets in the shelter
	public Collection<CatVirtualPet> petsValues() {
		return pets.values();
	}

	// return the number of pets in the shelter
	public int getNumberOfPetsInShelter() {
		return pets.size();
	}

	// return a specific CatVirtualPet given its name
	public CatVirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	// allow intake of a homeless pet
	public void inTake(CatVirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	// allow adoption of a homeless pet
	public void adopt(String name) {
		pets.remove(name);
	}

	// feed all of the pets in the shelter
	public void feedAllPets() {
		for (CatVirtualPet pet : pets.values()) {
			pet.feedDryFood();
		}
	}

	// water all of the pets in the shelter
	public void waterAllPets() {
		for (CatVirtualPet pet : pets.values()) {
			pet.waterCat();
		}
	}

	// plays (or performs some other interaction(s)) with an individual pet in the
	// shelter
	public void playWithOnePetByName(String name) {
		pets.get(name).dragRibbon();
	}

	// include a tick method that calls the tick method for each of the pets in the
	// shelter, updating their needs
	public void tickAllPets() {
		for (CatVirtualPet pet : pets.values()) {
			pet.tick();
		}
	}

	public void showAllPetsValuesInSentences() {
		for (CatVirtualPet pet : pets.values()) {
			System.out.println("Cat name: " + pet.getName() + " Description : " + pet.getDescription());
			System.out.println("Hunger = " + pet.getHunger() + "%\tHealth = " + pet.getHealth() + "%\tHappiness = "
					+ pet.getHappiness() + "%");
			pet.computeAndDisplayContentment();
			System.out.println(" ");
		}

	}

	public void showAllPetsValuesTable() {
		System.out.println("Name\t\t|Hunger\t\t|Health\t\t|Happiness\t|Contentment");
		System.out.println("--------------------------------------------------------------------------");
		for (CatVirtualPet pet : pets.values()) {
			System.out.println(pet.getName() + "\t\t|" + pet.getHunger() + "%\t\t|" + pet.getHealth() + "%\t\t|"
					+ pet.getHappiness() + "%\t\t|" + pet.getContentment() + "%");
			System.out.println(" ");

		}

	}

}
