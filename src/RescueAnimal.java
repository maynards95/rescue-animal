import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
    private String trainingStatus;
    private boolean reserved;
    private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }

    // Accessor Method
    public String getName() {
        return name;
    }

    //Mutator method
    public void setName(String name) {
        this.name = name;
    }

    // Accessor Method
    public String getAnimalType() {
        return animalType;
    }

    //Mutator method
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    // Accessor Method
    public String getGender() {
        return gender;
    }

    //Mutator method
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Accessor Method
    public String getAge() {
        return age;
    }

    //Mutator method
    public void setAge(String age) {
        this.age = age;
    }

    // Accessor Method
    public String getWeight() {
        return weight;
    }

    //Mutator method
    public void setWeight(String weight) {
        this.weight = weight;
    }

    // Accessor Method
    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    //Mutator method
    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    // Accessor Method
    public String getAcquisitionLocation() {
        return acquisitionCountry;
    }

    //Mutator method
    public void setAcquisitionLocation(String acquisitionCountry) {
        this.acquisitionCountry = acquisitionCountry;
    }

    // Accessor Method
    public boolean getReserved() {
        return reserved;
    }

    //Mutator method
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    // Accessor Method
    public String getInServiceLocation() {
        return inServiceCountry;
    }

    //Mutator method
    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }



    // Accessor Method
    public String getTrainingStatus() {
        return trainingStatus;
    }

    //Mutator method
    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    @Override
    public String toString() {
        return  animalType + " [Name: " + name + ", Training Status: ," + trainingStatus + ", Acquisition Country: ," + acquisitionCountry + ", Reserved: ," + reserved + "]";
    }
}
