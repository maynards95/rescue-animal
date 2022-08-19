public class Monkey extends RescueAnimal {

    // Monkey specific attributes
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    // Monkey constructor
    public Monkey(String name, String species, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String bodyLength, String height )
    {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    //Default constructor
    public Monkey() {
    }

    //Accessor method
    public String getTailLength() {
        return tailLength;
    }

    //Mutator method
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    //Accessor method
    public String getHeight() {
        return height;
    }

    //Mutator method
    public void setHeight(String height) {
        this.height = height;
    }

    //Accessor method
    public String getBodyLength() {
        return bodyLength;
    }

    //Mutator method
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    //Accessor method
    public String getSpecies() {
        return species;
    }

    //Mutator method
    public void setSpecies(String species) {
        this.species = species;
    }


    @Override
    public String toString() {
        return "Monkey [Name: " + getName() + ", Training Status: " + getTrainingStatus() + ", Acquired from: " +getAcquisitionLocation() + ", Reserved: " + getReserved() + "]";
    }
}
