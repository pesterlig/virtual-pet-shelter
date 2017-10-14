import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTests {

	VirtualPetShelter testVirtualPetShelter;

	@Before
	public void setUpTestContext() {
		testVirtualPetShelter = new VirtualPetShelter();
		testVirtualPetShelter.inTake(new VirtualPet("Sam", "ugly", 50, 50, 50, 50.0));
		testVirtualPetShelter.inTake(new VirtualPet("Frodo", "ugly", 50, 50, 50, 50.0));
		testVirtualPetShelter.inTake(new VirtualPet("Bilbo", "ugly", 50, 50, 50, 50.0));

	}

	@After
	public void tearDownTestContext() {

	}

	@Test
	public void shouldBeAbleToCreateAPetAssigningAllVariables() {
		VirtualPet underTest = new VirtualPet("Cat1", "basic", 50, 50, 50, 50.0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCreatePetWithOverloadedConstructorUsingNameDescription() {
		VirtualPet underTest = new VirtualPet("Cat2", "basic");
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnPetStatsToStringUsingNameDescription() {
		VirtualPet underTest = new VirtualPet("Cat2", "basic");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatGetHungerMatchesHungerFullConstructor() {
		VirtualPet underTest = new VirtualPet("Cat2", "basic", 1, 1, 1, 1.0);
		int check = underTest.getHunger();
		assertEquals(1, check);
	}

	@Test
	public void assertThatGetHungerMatchesDefaultForOverloadedConstructor() {
		VirtualPet underTest = new VirtualPet("Cat2", "basic");
		int check = underTest.getHunger();
		assertEquals(75, check);
	}

	@Test
	public void assertFeedAllFeedsAll() {
		int samsOldHunger = testVirtualPetShelter.getPetByName("Sam").getHunger();
		int frodosOldHunger = testVirtualPetShelter.getPetByName("Frodo").getHunger();
		int bilbosOldHunger = testVirtualPetShelter.getPetByName("Bilbo").getHunger();
		testVirtualPetShelter.feedAllPets();
		assert (samsOldHunger > testVirtualPetShelter.getPetByName("Sam").getHunger());
		assert (frodosOldHunger > testVirtualPetShelter.getPetByName("Frodo").getHunger());
		assert (bilbosOldHunger > testVirtualPetShelter.getPetByName("Bilbo").getHunger());
	}

	@Test
	public void assertWaterAllWatersAll() {
		int samsOldHealth = testVirtualPetShelter.getPetByName("Sam").getHealth();
		int frodosOldHealth = testVirtualPetShelter.getPetByName("Frodo").getHealth();
		int bilbosOldHealth = testVirtualPetShelter.getPetByName("Bilbo").getHealth();
		testVirtualPetShelter.waterAllPets();
		assert (samsOldHealth < testVirtualPetShelter.getPetByName("Sam").getHealth());
		assert (frodosOldHealth < testVirtualPetShelter.getPetByName("Frodo").getHealth());
		assert (bilbosOldHealth < testVirtualPetShelter.getPetByName("Bilbo").getHealth());
	}
	@Test
	public void assertTickAllChangesHungerValuesForAll() {
		int samsOldHunger = testVirtualPetShelter.getPetByName("Sam").getHunger();
		int frodosOldHunger = testVirtualPetShelter.getPetByName("Frodo").getHunger();
		int bilbosOldHunger = testVirtualPetShelter.getPetByName("Bilbo").getHunger();
		testVirtualPetShelter.tickAllPets();
		assert (samsOldHunger < testVirtualPetShelter.getPetByName("Sam").getHunger());
		assert (frodosOldHunger < testVirtualPetShelter.getPetByName("Frodo").getHunger());
		assert (bilbosOldHunger < testVirtualPetShelter.getPetByName("Bilbo").getHunger());
	}
		
//	@Test 
//	public void assertAdoptBilboRemovesBilbosValuesFromMapOfPets() {
//	
//	}

//	@Test
//	public void assertDragRibbonIncreasesHappinessOnOnePet() {
//		int samsOldHappiness = testVirtualPetShelter.getPetByName("Sam").getHappiness();
//		testVirtualPetShelter.playWithPetByName("Sam");
//		assert (samsOldHappiness < testVirtualPetShelter.getPetByName("Sam").getHappiness());
//	}

	// @Test
	// public void assertThatCollectionPetsValuesReturnsBasicValues() {
	// VirtualPetShelter underTest = new VirtualPetShelter();
	// Cannot test this - have to do something with values and test that?
}
// @Test
// public void assertThatMapSizeReturnsOne() {
// Bank underTest = new Bank();
// underTest.add(new BankAccount("1","type",0));
// int check = underTest.getSize();
// assertEquals(1, check);
// }
// @Test
// public void assertThatGetVarietyMatchesUp() {
// CookieOrder underTest = new CookieOrder("test", 1);
// String check = underTest.getVariety();
// assertEquals("test", check);

// @Test
// public void shouldBeAbleToCreateACookieOrder() {
// CookieOrder underTest = new CookieOrder(" ", 0);
// assertNotNull(underTest);
// }

//

// @Test
// public void assertThatMapSizeReturnsOneAferClose() {
// Bank underTest = new Bank();
// underTest.add(new BankAccount("1","type",0));
// underTest.add(new BankAccount("2","type",0));
// underTest.closeAccount("1");
// int check = underTest.getSize();
// assertEquals(1, check);
// }
//
// @Test
// public void assertThatAccountIsFound() {
// Bank underTest = new Bank();
// underTest.add(new BankAccount("1","type",0));
// String check = underTest.getAccount("1").getAccoutNum();
// assertEquals ("1", check);
// }
//
// @Test
// public void assertThatBalanceIsCorrect() {
// Bank underTest = new Bank();
// underTest.add(new BankAccount("1","type",0));
// double check = underTest.getAccount("1").getBalance();
// assertEquals (0, check,.01);
// }
