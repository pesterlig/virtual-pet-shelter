This is the README for Virtual Pet Shelter

Setup

 Create a Java project in Eclipse named virtual-pet-shelter. DONE
 Create a README.md file in your project folder DONE
  ( to learn more about Markdown formatting, check out the Github Markdown Guide.)
  
 Create a GitHub repository also named virtual-pet-shelter DONE
  
Create the following classes:

 VirtualPet: You can start with your class from last week's assignment or create another. DONE
 
In addition to the requirements from last week's project:

include instance variables representing:
 name
 description DONE - (also made getters & setters for name and description)
include a constructor that accepts a name and description only DONE
include a constructor that, in addition to name and description, 
accepts starting values for the pet's attributes (hunger, boredom, etc) DONE

MAKE AN OVERRIDE FOR TOSTRING -DONE- PERHAPS USE IN interface after the tick method

 VirtualPetShelter: Homeless virtual pets need a place to stay.
  Make VirtualPetShelter class DONE

 include appropriate instance variable(s) to store the pets who reside at the shelter
 
 include methods that:
 return a Collection of all of the pets in the shelter DONE
 return a specific VirtualPet given its name - DONE
 allow intake of a homeless pet -DONE
 allow adoption of a homeless pet - DONE
 feed all of the pets in the shelter -DONE
 water all of the pets in the shelter - DONE
 plays (or performs some other interaction(s)) with an individual pet in the shelter -DONE
 include a tick method that calls the tick method for each of the pets in the shelter, 
 updating their needs -DONE

Sunday 10:37 am *****************************
Changed class names...hope that's okay.... 
 Working to include a method for getting description - writing the test first this time :)
 
 
 VirtualPetShelterApp: 
 
 VirtualPetShelterApp class
 
 Ideas *********************************************************************************
 Create kitten descriptions  - types
 Finnie - The Best Cat - start with all the highest stats - reactions are normal
 Foggy - The Kick-ass Cat - start with all the normal stats, extra hungry, hunts automatically
 Meriadoc - Norwegian Forest cat (Norsk skogkatt)  - A big, fluffy cat that gets hungry faster than other breeds
 Gollum - Sphynx cat - Skinny, Hairless, Outgoing - Health is low to start - needs water
 Legolas - Cornish Rex - Happiest Cat - Little food satisfies, health decreases only slightly with each tick, and Happiness starts at highest level
 American ShortHairs - all start with different stats, but have the same reaction to food, water & play
 Names and Descriptions - Bilbo - tuxedo coat, Frodo - Ginger Tom, Sam - Tabby Cat,
  
 Extra methods - cause why not...
 beSedated - sets happiness to the max, increases hunger
 shockTreatment -  increases all contentments, but doesn't change stats?  hmmm, what will this do?
Create a main method that…

MORE IDEAS - 7:40 PM SUNDAY *************************************
Make the DNA class inherit from the CatVirtualPet class and override the methods for feeding etc.

 implements a game loop. - DONE
 asks for user input. PARTIAL
 writes output to the console. PARTIAL
 calls VirtualPetShelter's tick method after each interaction DONE
Available user interface actions should include (at minimum)…

 feeding all the pets
 watering all the pets
 playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
 allow adoption of a pet, DONE
 which should display a list of pet names and descriptions, DONE
 allowing a user to select one DONE - NEEDS WORK ON NAME CASE
 allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description
(Hint: you can use tab characters ("\t") to align console output in columns.)

Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|83     |34     |23
Johnny	|69     |49     |2
Dee Dee	|39     |18     |88
Tommy	|59     |19     |37

What would you like to do next?

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit
Example Pet Selection Interaction

Ok, so you'd like to play with a pet. Please choose one:

[Joey] looks like he's seen better days.
[Johnny] is a bit nervous.
[Dee Dee] probably didn't start with that many legs.
[Tommy] smells like a Stargazer lily fresh with morning dew.

Which pet would you like to play with?
Tommy

Ok, you play with Tommy.
Required Tasks




 


Stretch Tasks

 Consider any stretch tasks from last week's project that you did not attempt.
 Keep track of the cleanliness of individual pets' cages and offer an option 
 in the user interface to clean pet cages
 DNA! In order to give your pets individual character,
 include as part of each pet's state one or more multipliers
 for needs so that one pet may become hungrier/thirstier/more bored slower/faster 
 than another pet. (Tip: you could create a class to encapsulate this.)
   