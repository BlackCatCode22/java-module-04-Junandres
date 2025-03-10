package dennis.zoo.com;

import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects
    public Animal() {
        numOfAnimals++;
    }

    // Create a constructor that will accept all fields as arguments.
    public Animal(String sex, int age, int weight, String animalName,
                  String animalID, String animalBirthDate, String animalColor,
                  String animalOrigin, String animalArrivalDate) {
        // Add an animal to keep track of the number of animals in our zoo.
        numOfAnimals++;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthDate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalArrivalDate = animalArrivalDate;
    }

    // Create all attributes (fields) needed for the ZooKeeperChallenge program.




    // sex will be 'male' or 'female'
    private String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // name will be a String;
    private String animalName;
    // animalID will be first two latin letters of the species name and an integer number. Number part of the ID must be
    // at least two characters. For example: Hy01, Hy02, Be01, Be02, etc.
    private String animalID;
    // animalBirthDate is going to be a string here (in this class)
    private String animalBirthDate;
    // animalColor is a String
    private String animalColor;
    // origin will be a string like: "from Friguia Park, Tunisia"
    private String animalOrigin;
    // arrival date will be the system date when the animal object was created
    private String animalArrivalDate;

    // Create getters and setters

    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalBirthDate() {
        return animalBirthDate;
    }
    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }

    public String getAnimalID() {
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalArrivalDate() { return animalArrivalDate; }
    public void setAnimalArrivalDate(String animalArrivalDate) { this.animalArrivalDate = animalArrivalDate; }
}
