package dennis.zoo.com;

import java.io.*;
import java.util.*;

public class ZooManager {
    private List<Animal> animals = new ArrayList<>();
    private Map<String, Integer> speciesCount = new HashMap<>();

    public void loadAnimals(String animalsFile, String namesFile) {
        try (BufferedReader brAnimals = new BufferedReader(new FileReader(animalsFile));
             BufferedReader brNames = new BufferedReader(new FileReader(namesFile))) {

            String line;
            while ((line = brAnimals.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 3) continue;

                String species = data[0].trim();
                String sex = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int weight = Integer.parseInt(data[3].trim());
                String birthDate = data[4].trim();
                String color = data[5].trim();
                String origin = data[6].trim();

                String name = brNames.readLine();
                if (name == null) name = "Unknown";

                Animal animal = createAnimal(species, sex, age, weight, name, birthDate, color, origin);
                if (animal != null) {
                    animals.add(animal);
                    speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    private Animal createAnimal(String species, String sex, int age, int weight, String name, String birthDate, String color, String origin) {
        return switch (species.toLowerCase()) {
            case "hyena" -> new Hyena(sex, age, weight, name, birthDate, color, origin);
            case "lion" -> new Lion(sex, age, weight, name, birthDate, color, origin);
            case "tiger" -> new Tiger(sex, age, weight, name, birthDate, color, origin);
            case "bear" -> new Bear(sex, age, weight, name, birthDate, color, origin);
            default -> null;
        };
    }

    public void generateReport(String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Zoo Animal Report\n");
            writer.write("==================\n");

            for (Animal animal : animals) {
                writer.write(animal + "\n");
            }

            writer.write("\nSpecies Count:\n");
            for (Map.Entry<String, Integer> entry : speciesCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }

            System.out.println("Report written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ZooManager zoo = new ZooManager();
        zoo.loadAnimals("arrivingAnimals.txt", "animalNames.txt");
        zoo.generateReport("newAnimals.txt");
    }
}
