import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    //Initialize ArrayLists
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();
    private static ArrayList<RescueAnimal> animalList = new ArrayList<>();

    public static void main(String[] args) {
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //keeps while loop going until we receive "false" from case q below
        boolean menuLoop = true; 

        //this loop shows the user the menu and takes their input. If the input is not valid it runs through the loop again.
        while (menuLoop) {
            //calls displayMenu method below
            displayMenu();
            //Initialize variable to receive user input
            String userInput = scanner.next();

            //switch case for our userInput variable
            switch (userInput) {
                //if userInput is 1, call the intakeNewDog method and pass scanner
                case "1" -> intakeNewDog(scanner);
                //if userInput is 2, call intakeNewMonkey method and pass scanner
                case "2" -> intakeNewMonkey(scanner);
                //if userInput is 3, call reserveAnimal method and pass scanner
                case "3" -> reserveAnimal(scanner);
                //calls printAnimals and passed userInput (4,5, or 6) to determine which animals to print
                case "4", "5", "6" -> printAnimals(userInput);
                //if userInput is q, we exit the loop and print a message to let the user know we are done.
                case "q" -> {
                    //displays exit text for user
                    System.out.println("Exiting menu: Goodbye.");
                    //variable to end our loop
                    menuLoop = false; 
                }
                //default case for catching invalid input
                default -> System.out.println("Invalid input please try again"); 
            }
        }
    }


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    public static void intakeNewDog(Scanner scanner) {
        //Creates a dog object to hold our user input
        Dog newdog = new Dog();

        //Goes to next line to catch user input
        scanner.nextLine();
         //prompts user for input
        System.out.println("What is the dog's name?");
        //next line of input will be stored in name variable
        String name = scanner.nextLine();

        // validates that the dog has not already been input into the system. If it has it will take user back to the menu
        for(Dog dog: dogList) {
            //checks if the dog name the user typed is the same as an already existing dog name
            if(dog.getName().equalsIgnoreCase(name)) {
                //if the dog name typed in is the same as already existing dog, let the user know we already have that dog
                System.out.println("\n\nThis dog is already in our system\n\n");
                //returns to menu
                return; 
            }
        }
        //Sets the dog name for our dog object
        newdog.setName(name); 
        //prompts user for input
        System.out.println("What is the dog's breed?"); 
        //next line of input is stored in breed variable
        String breed = scanner.nextLine();
        //sets the dog breed for our dog object
        newdog.setBreed(breed); 
        //prompts user for input
        System.out.println("What is the dog's gender?"); 
        //next line of input is stored in gender variable
        String gender = scanner.nextLine();
        //sets the dog gender for our dog object
        newdog.setGender(gender); 

        System.out.println("What is the dog's age?"); //prompts user for input
        String age = scanner.nextLine();
        newdog.setAge(age); //sets the dog objects age

        System.out.println("What is the dog's weight"); //prompts user for input
        String weight = scanner.nextLine();
        newdog.setWeight(weight); //sets the dog objects weight

        System.out.println("What is the dog's acquisition date?"); //prompts user for input
        String acquisitionDate = scanner.nextLine();
        newdog.setAcquisitionDate(acquisitionDate); //sets the acquisition date for the dog object

        System.out.println("What is the dog's acquisition country?"); //prompts user for input
        String acquisitionCountry = scanner.nextLine();
        newdog.setAcquisitionLocation(acquisitionCountry); //sets the acquisition country for the dog object

        System.out.println("What is the dog's training status?"); //prompts user for input
        String trainingStatus = scanner.nextLine();
        newdog.setTrainingStatus(trainingStatus); //sets the training status for the dog object

        System.out.println("True or false: The dog is reserved already."); //prompts user for input
        boolean reserved = scanner.nextBoolean();
        newdog.setReserved(reserved); //sets the boolean for newdog reserved
        scanner.nextLine();

        System.out.println("What is the dog's in service country?"); //prompts user for input
        String inServiceCountry = scanner.nextLine();
        newdog.setInServiceCountry(inServiceCountry);
        newdog.setAnimalType("dog"); //sets animaltype to dog

        // adds our newly created "newdog" object to dog array
        dogList.add(newdog);

        // adds newdog to animalList for sorting in printanimal()
        animalList.add(newdog);

        System.out.print("A new dog has been added to dog list."); // lets user know a dog has been added to the list
    }


    // prompts user for each attribute for the monkey and stores it using mutator methods we set in Monkey.java
    public static void intakeNewMonkey(Scanner scanner) {
        Monkey newmonkey= new Monkey(); //creating new monkey object
        scanner.nextLine();

        System.out.println("What is the monkey's name?"); //prompts user for input
        String name = scanner.nextLine(); //sets monkeys name
        for(Monkey monkey: monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        newmonkey.setName(name);

        System.out.println("What is the monkey's species?"); //prompts user for input
        String species = scanner.nextLine();

        // if and else loop for input validation so we ensure only the species on monkey we want are inputted, otherwise it returns to menu and prints an error
        if (species.equalsIgnoreCase("Capuchin")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Guenon")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set"); // sets monkeys species
        }
        else if (species.equalsIgnoreCase("Macaque")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Marmoset")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Squirrel monkey")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Tamarin")) {
            newmonkey.setSpecies(species);
            System.out.println("Species set");
        }
        else {
            System.out.println("ERROR SPECIES NOT ALLOWED"); //error message if the species is not in our allowed list
            return; // returns to menu
            }

        System.out.println("What is the monkey's gender?"); //prompts user for input
        String gender = scanner.nextLine();
        newmonkey.setGender(gender); //sets monkeys gender

        System.out.println("What is the monkey's age?"); //prompts user for input
        String age = scanner.nextLine();
        newmonkey.setAge(age); //sets monkeys age

        System.out.println("What is the monkey's weight"); //prompts user for input
        String weight = scanner.nextLine();
        newmonkey.setWeight(weight); //sets monkeys weight

        System.out.println("What is the monkey's acquisition date?"); //prompts user for input
        String acquisitionDate = scanner.nextLine();
        newmonkey.setAcquisitionDate(acquisitionDate); //sets monkeys acquisition date

        System.out.println("What is the monkey's acquisition country?"); //prompts user for input
        String acquisitionCountry = scanner.nextLine();
        newmonkey.setAcquisitionLocation(acquisitionCountry); // sets monkeys acquisition country

        System.out.println("What is the monkey's training status?"); //prompts user for input
        String trainingStatus = scanner.nextLine();
        newmonkey.setTrainingStatus(trainingStatus); //sets monkeys training status

        System.out.println("True or false: The monkey is reserved already."); //prompts user for input
        boolean reserved = scanner.nextBoolean();
        newmonkey.setReserved(reserved); //sets monkeys reserved status
        scanner.nextLine();

        System.out.println("What is the monkey's in service country?"); //prompts user for input
        String inServiceCountry = scanner.nextLine();
        newmonkey.setInServiceCountry(inServiceCountry); //sets monkeys in service country

        System.out.println("What is the monkey's tail length?"); //prompts user for input
        String tailLength = scanner.nextLine();
        newmonkey.setTailLength(tailLength); //sets monkeys tail length

        System.out.println("What is the monkey's body length?"); //prompts user for input
        String bodyLength = scanner.nextLine();
        newmonkey.setBodyLength(bodyLength); // sets monkeys bodylength

        System.out.println("What is the monkey's height ?"); //prompts user for input
        String height = scanner.nextLine();
        newmonkey.setHeight(height); //sets monkey height

        newmonkey.setAnimalType("monkey"); //sets animal type to monkey

        // adds our newly created "newmonkey" object to the monkey array
        monkeyList.add(newmonkey);

        // adds newmonkey to our animalList for sorting in printanimal()
        animalList.add(newmonkey);

        System.out.print("A new monkey has been added to monkey list."); // lets the user know a monkey was added to the list
    }


    public static void reserveAnimal(Scanner scanner) {
        String animalType; //local animalType variable for method
        String country; //local country variable for method

        System.out.println("Please enter desired animal type to search from"); //prompts user for input
        animalType = scanner.next();

        System.out.println("Please enter country to search from"); //prompts user for input
        country = scanner.next();

        //checks if monkey is available in given country
        if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (!monkey.getReserved()) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(country)) {
                        System.out.println(monkey);
                        monkey.setReserved(true);
                        System.out.println("Monkey successfully reserved");
                    }
                }
                else {
                    System.out.println("No available monkeys in " + country); //if all the monkeys in monkeylist are reserved already let the user know
                }
            }
            if (monkeyList.isEmpty()){ //if there are no monkeys in monkeylist, let the user know.
                System.out.println("No available monkeys in " + country);
            }
        }


        // checks if theres an available dog in given country
        if (animalType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (!dogList.isEmpty()) {
                    if (!dog.getReserved()) {
                        if (dog.getInServiceLocation().equalsIgnoreCase(country)) {
                            System.out.println(dog);
                            dog.setReserved(true);
                            System.out.println("Dog successfully reserved");
                        }
                    }
                    else {
                        System.out.println("No available dogs in " + country); // if all the dogs are already reserved, let the user know
                    }
                }
            }
            if (dogList.isEmpty()){
                System.out.println("No available dogs in " + country); // if the doglist is empty, let user know
            }
        }
    }

    public static void printAnimals(String userInput)
    {
        String availableanimal = null;
        // prints out the dogList array if user inputs 4 into the menu above
        if (userInput.equals("4")) {
            if (!dogList.isEmpty()) {
                System.out.println("All dogs: ");
                for (Dog dog : dogList) {
                    System.out.println(dog);
                }
            }
            else {
                System.out.println("We have no dogs currently.");
                }
        }
        // prints out the monkeyList if user inputs 5 into the menu above
        if (userInput.equals("5")) {
            if (!monkeyList.isEmpty()) {
                System.out.println("All monkeys: ");
                for (Monkey monkey : monkeyList) {
                    System.out.println(monkey);
                }
            }
            else
                {
                System.out.println("We have no monkeys currently.");
            }
        }
        // prints out the animalList array created if the user inputs 6, but only the ones that are not reserved and are "in service" training status
        if (userInput.equals("6")) {
            System.out.println("Available animals: ");
            for (RescueAnimal animal: animalList) {
                if(!animal.getReserved() && animal.getTrainingStatus().equalsIgnoreCase("in service")) {
                    availableanimal = String.valueOf(animal);
                    System.out.println(availableanimal);
                }
            }
            if (availableanimal==null) {
                System.out.println("No available animals at this time.");
            }
        }
    }
}
