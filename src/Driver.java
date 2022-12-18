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
        //Sets the dog name for our dog object
        newDog.setName(name); 
        //prompts user for dogs breed
        System.out.println("What is the dog's breed?"); 
        //next line of input is stored in breed variable
        String breed = scanner.nextLine();
        //sets the dog breed for our dog object
        newDog.setBreed(breed); 
        //prompts user for dogs gender
        System.out.println("What is the dog's gender?"); 
        //next line of input is stored in gender variable
        String gender = scanner.nextLine();
        //sets the dog gender for our dog object
        newDog.setGender(gender); 
        //prompts user for dogs age    
        System.out.println("What is the dog's age?"); 
        //next line of input is stored in the age variable
        String age = scanner.nextLine();
        //sets the dogs age for our dog object
        newDog.setAge(age); 
        //prompts user for dogs weight
        System.out.println("What is the dog's weight"); 
        //next line of input is stored in the weight variable
        String weight = scanner.nextLine();
        //sets the dogs weight for our dog object
        newDog.setWeight(weight);
        //prompts user for acquisition date
        System.out.println("What is the dog's acquisition date?"); 
        //next line of input is stored in the acquisitionDate variable
        String acquisitionDate = scanner.nextLine();
        //sets the dogs acquisitionDate for our dog object
        newDog.setAcquisitionDate(acquisitionDate); 
        //prompts user for acquisition country
        System.out.println("What is the dog's acquisition country?"); 
        //next line of input is stored in the acquisitionCountry variable
        String acquisitionCountry = scanner.nextLine();
        //sets the acquisitionLocation for our dog object
        newDog.setAcquisitionLocation(acquisitionCountry); 
        //prompts user for dogs training status
        System.out.println("What is the dog's training status?"); 
        //next line of input is stored in the trainingStatus variable
        String trainingStatus = scanner.nextLine();
        //sets the trainingStatus for the dog object
        newDog.setTrainingStatus(trainingStatus); 
        //prompts user to answer true or false if the dog is reserved
        System.out.println("True or false: The dog is reserved already."); 
        //next boolean is stored in the reserved variable
        boolean reserved = scanner.nextBoolean();
        //sets the reserved status for our dog object
        newDog.setReserved(reserved); 
        //clears next line to receive next input
        scanner.nextLine();
        //prompts user for dogs service country
        System.out.println("What is the dog's in service country?"); 
        //next line of input is stored in the inServiceCountry variable
        String inServiceCountry = scanner.nextLine();
        //sets the inServiceCountry for our dog object
        newDog.setInServiceCountry(inServiceCountry);
        //sets animaltype to dog
        newDog.setAnimalType("dog"); 
        // adds our newly created "newdog" object to dog array
        dogList.add(newDog);
        // adds newdog to animalList for sorting in printanimal()
        animalList.add(newDog);
        //prints message to let user known we successfully added dog object to our arraylist
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
        //prompts user for monkeys species
        System.out.println("What is the monkey's species?");
        //next line if input will be stored in the species variable
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

        //prompts user for monkeys gender
        System.out.println("What is the monkey's gender?"); 
        //next line of input is stored in the gender variable
        String gender = scanner.nextLine();
        //sets the gender for our monkey object
        newMonkey.setGender(gender); 
        //prompts user for monkeys age
        System.out.println("What is the monkey's age?"); 
        //next line of input is stored in the age variable
        String age = scanner.nextLine();
        //sets the age for our monkey object
        newMonkey.setAge(age);
        //prompts user for monkeys weight
        System.out.println("What is the monkey's weight"); 
        //next line of input will be stored in the weight variable
        String weight = scanner.nextLine();
        //sets the weight for our monkey object
        newMonkey.setWeight(weight); 
        //prompts user for monkeys acquisitionDate
        System.out.println("What is the monkey's acquisition date?"); 
        //next line of input is stored in the acquisitionDate variable
        String acquisitionDate = scanner.nextLine();
        //sets the acquisitionDate for our monkey object
        newMonkey.setAcquisitionDate(acquisitionDate); 
        //prompts user for the monkeys acquisitionCountry
        System.out.println("What is the monkey's acquisition country?"); 
        //next line of input will be stored in the acquisitionCountry variable
        String acquisitionCountry = scanner.nextLine();
        //sets the acquisitionLocation for our monkey object
        newMonkey.setAcquisitionLocation(acquisitionCountry);
        //prompts user for monkeys training status
        System.out.println("What is the monkey's training status?"); 
        //next line of input will be stored in the trainingStatus variable
        String trainingStatus = scanner.nextLine();
        //sets the trainingStatus for our monkey object
        newMonkey.setTrainingStatus(trainingStatus); 
        //Prompts user to enter true or false if monkey is reserved 
        System.out.println("True or false: The monkey is reserved already."); 
        //next boolean input is stored in reserved variable
        boolean reserved = scanner.nextBoolean();
        //sets reserved status for our monkey object
        newMonkey.setReserved(reserved); 
        //clears next line to accept the next input from user
        scanner.nextLine();
        //prompts user for monkeys in service country
        System.out.println("What is the monkey's in service country?");
        //next line of input is stored in the inServiceCountry variable
        String inServiceCountry = scanner.nextLine();
        //sets the inServiceCountry for our monkey object
        newMonkey.setInServiceCountry(inServiceCountry); 
        //prompts user for monkeys tail length
        System.out.println("What is the monkey's tail length?"); 
        //next line of input is stored in the tailLength variable
        String tailLength = scanner.nextLine();
        //sets the tail length for our monkey object
        newMonkey.setTailLength(tailLength); 
        //prompts user for monkeys body length
        System.out.println("What is the monkey's body length?"); 
        //next line of input is stored in the bodyLength variable
        String bodyLength = scanner.nextLine();
        //sets the body length for our monkey object
        newMonkey.setBodyLength(bodyLength);
        //prompts user for monkeys height
        System.out.println("What is the monkey's height?"); 
        //next line of input is stored in the height variable
        String height = scanner.nextLine();
        //sets the height for our monkey object
        newMonkey.setHeight(height); 
        //sets the animal type to monkey for our monkey object, this is so we can search for monkeys in our printanimal method
        newMonkey.setAnimalType("monkey"); 
        // adds our newly created "newmonkey" object to the monkey arraylist
        monkeyList.add(newMonkey);
        // adds newmonkey to our animalList for sorting in printanimal()
        animalList.add(newMonkey);
        //lets user know we have successfully added a new monkey to our arraylists
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
