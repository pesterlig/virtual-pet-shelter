import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	// VirtualPetShelter class
	//
	// include appropriate instance variable(s) to store the pets who reside at the
	// shelter
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// return a Collection of all of the pets in the shelter
	public Collection<VirtualPet> petsValues() {
		return pets.values();

	}

	// return a specific VirtualPet given its name
	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	// allow intake of a homeless pet
	public void inTake(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	// allow adoption of a homeless pet 
	public void adopt(String name) {
		pets.remove(name);
	}

	// feed all of the pets in the shelter
	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedDryFood();
		}
	}

	// water all of the pets in the shelter
	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterCat();
		}
	}
	public void tickAllPets() {
		for (VirtualPet pet : pets.values()) {
				pet.tick();
		}
	}

	
	
	
}

// include methods that:
// plays (or performs some other interaction(s)) with an individual pet in the
// shelter
// include a tick method that calls the tick method for each of the pets in the
// shelter, updating their needs
