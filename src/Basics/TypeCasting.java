package Basics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class TypeCasting {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new DogAnimal());
        animals.add(new HorseAnimal());
        animals.add(new CatAnimal());

        for (Animal animal : animals) {
            animal.eatAndSleep();
            if(animal instanceof DogAnimal) {
                ((DogAnimal) animal).bark();
            } else if (animal instanceof CatAnimal) {
                ((CatAnimal) animal).meow();
            } else {
                ((HorseAnimal) animal).eatGrass();
            }
        }
    }
}

class Animal {
    void eatAndSleep() {
        System.out.println("Animals can eat and sleep");
    }
}

class DogAnimal extends Animal {

    void bark() {
        System.out.println("Dog can bark");
    }

    final void playWithDog() {
        System.out.println("Play with dog");
    }
}

class CatAnimal extends Animal {
    void meow() {
        System.out.println("Cat can meow");
    }
}

class HorseAnimal extends  Animal {
    void eatGrass() {
        System.out.println("Can eat grass");
    }
}