package InstanceOf;
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal pet = new Dog();

        if (pet instanceof Dog) {
            pet.makeSound();
            ((Dog) pet).fetch();
        } else {
            pet.makeSound(); // Calls Animal's makeSound method
        }
    }
}
