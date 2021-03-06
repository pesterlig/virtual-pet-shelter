import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTests {

	ShelterVirtualPet testShelterVirtualPet;

	@Before
	public void setUpTestContext() {
		testShelterVirtualPet = new ShelterVirtualPet();
		testShelterVirtualPet.inTake(new CatVirtualPet("Sam", "ugly", 50, 50, 50, 50.0));
		testShelterVirtualPet.inTake(new CatVirtualPet("Frodo", "ugly", 50, 50, 50, 50.0));
		testShelterVirtualPet.inTake(new CatVirtualPet("Bilbo", "ugly", 50, 50, 50, 50.0));

	}

	@After
	public void tearDownTestContext() {

	}

	@Test
	public void shouldBeAbleToCreateAPetAssigningAllVariables() {
		CatVirtualPet underTest = new CatVirtualPet("Cat1", "basic", 50, 50, 50, 50.0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCreatePetWithOverloadedConstructorUsingNameDescription() {
		CatVirtualPet underTest = new CatVirtualPet("Cat2", "basic");
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnPetStatsToStringUsingNameDescription() {
		CatVirtualPet underTest = new CatVirtualPet("Cat2", "basic");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatGetHungerMatchesHungerFullConstructor() {
		CatVirtualPet underTest = new CatVirtualPet("Cat2", "basic", 1, 1, 1, 1.0);
		int check = underTest.getHunger();
		assertEquals(1, check);
	}

	@Test
	public void assertThatGetHungerMatchesDefaultForOverloadedConstructor() {
		CatVirtualPet underTest = new CatVirtualPet("Cat2", "basic");
		int check = underTest.getHunger();
		assertEquals(75, check);
	}

	@Test
	public void assertFeedAllFeedsAll() {
		int samsOldHunger = testShelterVirtualPet.getPetByName("Sam").getHunger();
		int frodosOldHunger = testShelterVirtualPet.getPetByName("Frodo").getHunger();
		int bilbosOldHunger = testShelterVirtualPet.getPetByName("Bilbo").getHunger();
		testShelterVirtualPet.feedAllPets();
		assert (samsOldHunger > testShelterVirtualPet.getPetByName("Sam").getHunger());
		assert (frodosOldHunger > testShelterVirtualPet.getPetByName("Frodo").getHunger());
		assert (bilbosOldHunger > testShelterVirtualPet.getPetByName("Bilbo").getHunger());
	}

	@Test
	public void assertWaterAllWatersAll() {
		int samsOldHealth = testShelterVirtualPet.getPetByName("Sam").getHealth();
		int frodosOldHealth = testShelterVirtualPet.getPetByName("Frodo").getHealth();
		int bilbosOldHealth = testShelterVirtualPet.getPetByName("Bilbo").getHealth();
		testShelterVirtualPet.waterAllPets();
		assert (samsOldHealth < testShelterVirtualPet.getPetByName("Sam").getHealth());
		assert (frodosOldHealth < testShelterVirtualPet.getPetByName("Frodo").getHealth());
		assert (bilbosOldHealth < testShelterVirtualPet.getPetByName("Bilbo").getHealth());
	}

	@Test
	public void assertTickAllChangesHungerValuesForAll() {
		int samsOldHunger = testShelterVirtualPet.getPetByName("Sam").getHunger();
		int frodosOldHunger = testShelterVirtualPet.getPetByName("Frodo").getHunger();
		int bilbosOldHunger = testShelterVirtualPet.getPetByName("Bilbo").getHunger();
		testShelterVirtualPet.tickAllPets();
		assert (samsOldHunger < testShelterVirtualPet.getPetByName("Sam").getHunger());
		assert (frodosOldHunger < testShelterVirtualPet.getPetByName("Frodo").getHunger());
		assert (bilbosOldHunger < testShelterVirtualPet.getPetByName("Bilbo").getHunger());
	}

	@Test
	public void assertTickAllChangesContentmentValuesForAll() {
		double samsOldContentment = testShelterVirtualPet.getPetByName("Sam").getContentment();
		double frodosOldContentment = testShelterVirtualPet.getPetByName("Frodo").getContentment();
		double bilbosOldContentment = testShelterVirtualPet.getPetByName("Bilbo").getContentment();
		testShelterVirtualPet.tickAllPets();
		assert (samsOldContentment > testShelterVirtualPet.getPetByName("Sam").getContentment());
		assert (frodosOldContentment > testShelterVirtualPet.getPetByName("Frodo").getContentment());
		assert (bilbosOldContentment > testShelterVirtualPet.getPetByName("Bilbo").getContentment());
	}
	// @Test
	// public void assertThatGetHungerMatchesHungerFullConstructor() {
	// CatVirtualPet underTest = new CatVirtualPet("Cat2", "basic", 1, 1, 1, 1.0);
	// int check = underTest.getHunger();
	// assertEquals(1, check);
	//
	// @Test
	// public void assertThatGetDesriptionReturnsDescriptionForBilbo() {
	//
	// CatVirtualPet underTest = new CatVirtualPet("Bilbo", "Tuxedo cat");
	// String check =
	// underTest.ShelterVirtualPet.getPetByName("Bilbo").getDescription();
	//
	// assert (bilbosOldHunger >
	// testShelterVirtualPet.getPetByName("Bilbo").getHunger());
	// }
	//

	// @Test
	// public void assertForSamPlayWithOnePetByNameIncreasesOnlySamsHappiness() {
	// int samsOldHappiness =
	// testShelterVirtualPet.getPetByName("Frodo").getHappiness();
	// int frodosOldHappiness =
	// testShelterVirtualPet.getPetByName("Frodo").getHappiness();
	// int bilbosOldHappiness =
	// testShelterVirtualPet.getPetByName("Bilbo").getHappiness();
	// testShelterVirtualPet.playWithOnePetByName("Sam");
	// assert (samsOldHappiness <
	// testShelterVirtualPet.getPetByName("Sam").getHappiness());
	// assert (frodosOldHappiness <
	// testShelterVirtualPet.getPetByName("Frodo").getHappiness());
	// assert (bilbosOldHappiness <
	// testShelterVirtualPet.getPetByName("Bilbo").getHappiness());
	// }

	@Test
	public void assertForSamPlayWithOnePetByNameIncreasesOnlySamsHappiness() {
		int samsOldHappiness = testShelterVirtualPet.getPetByName("Sam").getHappiness();
		int frodosOldHappiness = testShelterVirtualPet.getPetByName("Frodo").getHappiness();
		int bilbosOldHappiness = testShelterVirtualPet.getPetByName("Bilbo").getHappiness();
		testShelterVirtualPet.playWithOnePetByName("Sam");
		assert (samsOldHappiness < testShelterVirtualPet.getPetByName("Sam").getHappiness());
		assert (frodosOldHappiness == testShelterVirtualPet.getPetByName("Frodo").getHappiness());
		assert (bilbosOldHappiness == testShelterVirtualPet.getPetByName("Bilbo").getHappiness());
	}
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
