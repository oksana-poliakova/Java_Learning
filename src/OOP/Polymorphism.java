package OOP;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Polymorphism {
    public static void main(String[] args) {
        Mobile[] devices = new Mobile[3];
        devices[0] = new IPhone();
        devices[1] = new Android();
        devices[2] = new IPhone();

        Mobile device = new Mobile();

        if (device instanceof IPhone) {
            System.out.println("It's iPhone");
        }

        printInformation(devices);
    }

    public static void printInformation(Mobile[] devices) {
        for (Mobile device : devices) {
            device.printInfo();
            device.makeSound();
        }

    }
}

class Mobile {
    public void makeSound() {
        System.out.println("The mobile device makes a sound");
    }

    public void printInfo() {
        System.out.println("Print information about mobile");
    }
}

class IPhone extends Mobile {
    @Override
    public void makeSound() {
        System.out.println("The iPhone rings");
    }
}

class Android extends Mobile {
    @Override
    public void makeSound() {
        System.out.println("The Android device plays a notification sound");
    }
}