package cap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the pet: ");
            String name = input.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            String genere;
            Pet pet;

            do {
                System.out.println("Enter c for cat, d for dog");
                genere = input.nextLine();

            } while (!genere.equals("c") && !genere.equals("d"));

            if (genere.equals("c")) {
                pet = new Cat();

                System.out.println("Enter the cat's coat color:");
                String color = input.nextLine();

                ((Cat) pet).setCoat_color(color);

            } else {
                pet = new Dog();

                System.out.println("Enter the dog's weight:");
                double weight = input.nextDouble();
                input.nextLine();

                ((Dog) pet).setWeight(weight);
            }

            pet.setName(name);
            pets.add(pet);

        }

        System.out.println("\nCats:");
        for (int i = 0; i < pets.size(); i++) {
            Pet temp = pets.get(i);
            if (temp instanceof Cat) {
                Cat cat = (Cat) temp;
                System.out.print(cat.getName() + " is " + cat.getCoat_color());
            }
        }
        System.out.println("\nDogs:");
        for (int i = 0; i < pets.size(); i++) {
            Pet temp = pets.get(i);
            if (temp instanceof Dog) {
                Dog dog = (Dog) temp;
                System.out.println(dog.getName() + "s weight is " + dog.getWeight());
            }
        }

        DogsInfo dogsInfo = new DogsInfo(pets);

        System.out.println("\n All dogs average is: " + dogsInfo.getAverage());
        System.out.println("\n The maximum weight is: " + dogsInfo.getMaximumWeight());
        System.out.println("\n The minimum weight is: " + dogsInfo.getMinimumWeight());

    }
}


class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        name = petName;
    }

    public String speak() {
        return "I'm your cuddly little pet.";
    }

}

class Cat extends Pet {
    private String coat_color;

    public String speak() {
        return "Don't give me orders.\n" +
                "I speak only when I want to.";
    }

    public String getCoat_color() {
        return coat_color;
    }

    public void setCoat_color(String coat_color) {
        this.coat_color = coat_color;
    }
}

class Dog extends Pet {
    private double weight;

    public String fetch() {
        return "Yes, master. Fetch I will.";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class DogsInfo {
    private double average, minimumWeight, maximumWeight;

    private List<Dog> allDogs = new ArrayList<>();

    public DogsInfo(List<Pet> myArray) {

        for (Pet pet : myArray) {
            if (pet instanceof Dog) {
                allDogs.add((Dog) pet);
            }
        }
    }

    public double getAverage() {
        double sum = 0;
        for (Dog dog : allDogs) {
            sum += dog.getWeight();
        }
        average = sum / allDogs.size();

        return average;
    }

    public double getMaximumWeight() {
        maximumWeight = Double.NEGATIVE_INFINITY;

        for (Dog dog : allDogs) {
            double weight=dog.getWeight();
            if (weight > maximumWeight) {
                maximumWeight = weight;
            }
        }

        return maximumWeight;
    }

    public double getMinimumWeight() {
        minimumWeight = Double.POSITIVE_INFINITY;

        for (Dog dog : allDogs) {
            double weight=dog.getWeight();
            if (weight < minimumWeight) {
                minimumWeight = weight;
            }
        }

        return minimumWeight;
    }
}


