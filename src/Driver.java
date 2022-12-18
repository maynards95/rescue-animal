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
                case "1"-> intakeNewDog(scanner);
                //if userInput is 2, call intakeNewMonkey method and pass scanner
                case "2" -> intakeNewMonkey(scanner);
                //if userInput is 3, call reserveAnimal method and pass scanner
                case "3"-> reserveAnimal(scanner);
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

    //method to intake a new dog
    public static void intakeNewDog(Scanner scanner) {
        //Creates a dog object to hold our user input
        Dog newDog = new Dog();

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
        
        newDog.setName(name); 
        System.out.println("What is the dog's breed?"); 
        String breed = scanner.nextLine();
        newDog.setBreed(breed); 
        System.out.println("What is the dog's gender?"); 
        String gender = scanner.nextLine();
        newDog.setGender(gender);   
        System.out.println("What is the dog's age?"); 
        String age = scanner.nextLine();
        newDog.setAge(age); 
        System.out.println("What is the dog's weight"); 
        String weight = scanner.nextLine();
        newDog.setWeight(weight);
        System.out.println("What is the dog's acquisition date?"); 
        String acquisitionDate = scanner.nextLine();
        newDog.setAcquisitionDate(acquisitionDate); 
        System.out.println("What is the dog's acquisition country?"); 
        String acquisitionCountry = scanner.nextLine();
        newDog.setAcquisitionLocation(acquisitionCountry); 
        System.out.println("What is the dog's training status?"); 
        String trainingStatus = scanner.nextLine();
        newDog.setTrainingStatus(trainingStatus);
        System.out.println("True or false: The dog is reserved already."); 
        boolean reserved = scanner.nextBoolean();
        newDog.setReserved(reserved); 
        //clears next line to receive next input
        scanner.nextLine();
        System.out.println("What is the dog's in service country?"); 
        String inServiceCountry = scanner.nextLine();
        newDog.setInServiceCountry(inServiceCountry);
        newDog.setAnimalType("dog"); 
        dogList.add(newDog);
        animalList.add(newDog);
        System.out.print("A new dog has been added to dog list."); 
        return;
    }


    //method for the intake of a new monkey
    public static void intakeNewMonkey(Scanner scanner) {
        //Creates a dog object to hold our user input
        Monkey newMonkey= new Monkey(); 
        //Goes to next line to catch user input
        scanner.nextLine();
        //prompts user for monkeys name
        System.out.println("What is the monkey's name?"); 
        //next line of input is stored in the name variable 
        String name = scanner.nextLine(); 

        //loop to check if monkeys name is already in our monkey arraylist
        for(Monkey monkey: monkeyList) {
            //checks if the monkeys name is already in our monkey arraylist
            if (monkey.getName().equalsIgnoreCase(name)) {
                //if the monkeys name is already in our arraylist let the user know
                System.out.println("\n\nThis monkey is already in our system\n\n");
                //returns back to main menu
                return; 
            }
        }
        //sets the name for our monkey object
        newMonkey.setName(name);
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        // if and else loop for input validation so we ensure only the species on monkey we want are inputted,
        // otherwise it returns to menu and prints an error
        if (species.equalsIgnoreCase("Capuchin")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Guenon")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set"); 
        }
        else if (species.equalsIgnoreCase("Macaque")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Marmoset")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Squirrel monkey")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set");
        }
        else if (species.equalsIgnoreCase("Tamarin")) {
            //sets species for our monkey object
            newMonkey.setSpecies(species);
            //lets user know species has been accepted
            System.out.println("Species set");
        }
        else {
            //error message if the species is not in our allowed list
            System.out.println("ERROR SPECIES NOT ALLOWED"); 
            // returns to main menu
            return; 
            }

        System.out.println("What is the monkey's gender?"); 
        String gender = scanner.nextLine();
        newMonkey.setGender(gender); 
        System.out.println("What is the monkey's age?"); 
        String age = scanner.nextLine();
        newMonkey.setAge(age);
        System.out.println("What is the monkey's weight"); 
        String weight = scanner.nextLine();
        newMonkey.setWeight(weight); 
        System.out.println("What is the monkey's acquisition date?"); 
        String acquisitionDate = scanner.nextLine();
        newMonkey.setAcquisitionDate(acquisitionDate); 
        System.out.println("What is the monkey's acquisition country?"); 
        String acquisitionCountry = scanner.nextLine();
        newMonkey.setAcquisitionLocation(acquisitionCountry);
        System.out.println("What is the monkey's training status?"); 
        String trainingStatus = scanner.nextLine();
        newMonkey.setTrainingStatus(trainingStatus); 
        System.out.println("True or false: The monkey is reserved already."); 
        boolean reserved = scanner.nextBoolean();
        newMonkey.setReserved(reserved); 
        //clears next line to accept the next input from user
        scanner.nextLine();
        System.out.println("What is the monkey's in service country?");
        String inServiceCountry = scanner.nextLine();
        newMonkey.setInServiceCountry(inServiceCountry); 
        System.out.println("What is the monkey's tail length?"); 
        String tailLength = scanner.nextLine();
        newMonkey.setTailLength(tailLength); 
        System.out.println("What is the monkey's body length?"); 
        String bodyLength = scanner.nextLine();
        newMonkey.setBodyLength(bodyLength);
        System.out.println("What is the monkey's height?"); 
        String height = scanner.nextLine();
        newMonkey.setHeight(height); 
        newMonkey.setAnimalType("monkey"); 
        monkeyList.add(newMonkey);
        animalList.add(newMonkey);
        System.out.print("A new monkey has been added to monkey list."); 
        return;
    }

    //method to reserve an animal for use
    public static void reserveAnimal(Scanner scanner) {
        //local animalType variable for method
        String animalType; 
        //local country variable for method
        String country; 

        //prompts user for what kind of animal they want to search for
        System.out.println("Please enter desired animal type to search from"); 
        //next input is stored in animalType variable
        animalType = scanner.next();
        //prompts user for which country they want to search from
        System.out.println("Please enter country to search from"); 
        //next input is stored in the country variable
        country = scanner.next();

        //checks if monkey is available in given country
        if (animalType.equalsIgnoreCase("monkey")) {
            //searching for monkey in monkeyList
            for (Monkey monkey : monkeyList) {
                //if monkey is not reserved
                if (!monkey.getReserved()) {
                    //searches if there is an available monkeys in the country user has inputted
                    if (monkey.getInServiceLocation().equalsIgnoreCase(country)) {
                        //prints available monkeys in that country
                        System.out.println(monkey);
                        //sets reserved variable to true
                        monkey.setReserved(true);
                        //lets user know that monkey has been reserved
                        System.out.println("Monkey successfully reserved");
                    }
                }
                //if there are not available monkeys in the chosen country tell user
                else {
                    System.out.println("No available monkeys in " + country); 
                }
            }
            //if our monkeyList arraylist is empty
            if (monkeyList.isEmpty()){ 
                //let user know there are not available monkeys in the chosen country
                System.out.println("No available monkeys in " + country);
            }
        }

        // loop to check if theres an available dog in given country
        if (animalType.equalsIgnoreCase("dog")) {
            //searching for dog in dogList
            for (Dog dog : dogList) {
                //if dogList is not empty
                if (!dogList.isEmpty()) {
                    //if dog is not reserved
                    if (!dog.getReserved()) {
                        //if the dogs location matches the country user wants to search from
                        if (dog.getInServiceLocation().equalsIgnoreCase(country)) {
                            //print available dogs
                            System.out.println(dog);
                            //sets dog to reserved
                            dog.setReserved(true);
                            //lets user know they have successfully reserved a dog
                            System.out.println("Dog successfully reserved");
                        }
                    }
                    //if the dog is reserved
                    else {
                        // if all the dogs are already reserved, let the user know
                        System.out.println("No available dogs in " + country); 
                    }
                }
            }
            //if the dogList array is empty 
            if (dogList.isEmpty()){
                //lets user know there are not available dogs in that country
                System.out.println("No available dogs in " + country);
            }
        }
    }

    //method to print all animals user inputs
    public static void printAnimals(String userInput)
    {
        //Initialize availableAnimal variable
        String availableAnimal = null;
        //If userInput is 4
        if (userInput.equals("4")) {
            //If dogList is not empty
            if (!dogList.isEmpty()) {
                //Print all dogs: before printing all dogs in dogList
                System.out.println("All dogs: ");
                //searches through dogList
                for (Dog dog : dogList) {
                    //prints dog objects
                    System.out.println(dog);
                }
            }
            //if dogList is empty
            else {
                //lets user know we have no dogs 
                System.out.println("We have no dogs currently.");
                }
        }
        //if userInput is 5
        if (userInput.equals("5")) {
            //if monkeyList is not empty
            if (!monkeyList.isEmpty()) {
                //print All monkeys: before printing all monkeys in monkeyList
                System.out.println("All monkeys: ");
                //searches for monkeys in monkeyList
                for (Monkey monkey : monkeyList) {
                    //prints monkey objects
                    System.out.println(monkey);
                }
            }
            //if monkeyList is empty
            else
                {
                //lets user know we have no monkeys
                System.out.println("We have no monkeys currently.");
            }
        }
        //if userInput equals 6
        if (userInput.equals("6")) {
            //prints Available animals: before animals are displayed
            System.out.println("Available animals: ");
            //searches for animals in animalList
            for (RescueAnimal animal: animalList) {
                //if animal is not reserved and the training status is "in service"
                if(!animal.getReserved() && animal.getTrainingStatus().equalsIgnoreCase("in service")) {
                    availableAnimal = String.valueOf(animal);
                    //print available animals
                    System.out.println(availableAnimal);
                }
            }
            //if there are not available animals
            if (availableAnimal==null) {
                // let user know no animals are available
                System.out.println("No available animals at this time.");
            }
        }
    }
}
