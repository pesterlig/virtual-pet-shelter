import java.util.Random;

public class VirtualPet {

	// In addition to the requirements from last week's project:
	//
	// include instance variables representing:
	// name
	// description
	// include a constructor that accepts a name and description only
	// include a constructor that, in addition to name and description,
	// accepts starting values for the pet's attributes (hunger, boredom, etc)

	Random generator = new Random();
	int randNum = generator.nextInt(4) + 1;
	int randNum2 = generator.nextInt(2) + 1;
	String catDragsIn;

	// instance data for creating instance variable
	private String name;
	private String description;
	private int hunger;
	private int health;
	private int happiness;
	private double contentment;

	// Constructor
	public VirtualPet(String name, String description, int hunger, int health, int happiness, double contentment) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.health = health;
		this.happiness = happiness;
		this.contentment = contentment;
	}

	// Overloaded Constructor
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 75;
		this.health = 45;
		this.happiness = 30;
		this.contentment = 50.00;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public double getContentment() {
		return contentment;
	}

	public void setContentment(double contentment) {
		this.contentment = contentment;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\tDescription: " + this.description + "\tHunger " + this.hunger + "\tHealth "
				+ this.health + "\tHappiness " + this.happiness + "\tContentment " + this.contentment;
	}

	public void tick() {
		contentment = ((100 - hunger) + health + happiness) / 3;
		hunger += 7;
		if (hunger > 100) {
			hunger = 100;
		} else if (hunger < 0) {
			hunger = 0;
		}
		health -= 3;
		if (health > 100) {
			health = 100;
		} else if (health < 0) {
			health = 0;
		}
		happiness -= 3;
		if (happiness > 100) {
			happiness = 100;
		} else if (happiness < 0) {
			happiness = 0;
		}
	}

	public void displayAsciiKitten() {
		char backSlash = '\\';
		System.out.println("	    /|");
		System.out.println("	  =(o  ` 7");
		System.out.println("	     ` o =");
		System.out.println("	   /   `" + backSlash);
		System.out.println("	   U U\n");

	}

	public void displayMenu(String name) {
		System.out.println("What would you like to do? (Input number of choice)");
		System.out.println(" 1 = Feed " + name + " expensive canned salmon");
		System.out.println(" 2 = Feed " + name + " dry food");
		System.out.println(" 3 = Hug " + name);
		System.out.println(" 4 = Drag a ribbon around for " + name + " to play with");
		System.out.println(" 5 = Ignore " + name);
		System.out.println(" 6 = Talk to  " + name);
	}

	public int feedSalmon() {
		hunger -= (20 * (randNum));
		return hunger;
	}

	public String hunt(int hungry, int choice) {
		int deadAnimal = randNum2;
		if (hungry > 60 && (choice != 1 || choice != 2)) {
			if (deadAnimal == 1) {
				catDragsIn = "a half-eaten squabbit";
			} else if (deadAnimal == 2) {
				catDragsIn = "a dead mouse head";
			} else if (deadAnimal == 3) {
				catDragsIn = "an angry injured bat";
			} else {
				catDragsIn = "";
			}
			hunger -= 20;
			return this.name + " went hunting and left " + catDragsIn + " on the doorstep.\n";
		}
		return "Miaow!";
	}

	public int feedDryFood() {
		hunger -= (10 * (randNum));
		return hunger;
	}

	public int hugCat() {
		happiness -= (5 * randNum);
		return happiness;
	}

	public int waterCat() {
		health += (20 * (randNum));
		return health;
	}

	public int dragRibbon() {
		happiness += (10 * (randNum));
		return happiness;
	}

}
