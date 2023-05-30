package OOP;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */

public class Inheritance2 {
    public static void main(String [] args) {
        Laptop laptop1 = new Laptop("ssd1", "ram1", 2);
        laptop1.open();
    }
}

class Computer {
    public String ssd;
    public String ram;

    public Computer(String ssd, String ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    // Getters
    public String getRam() {
        return ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void load() {
        System.out.println("It's loading...");
    }
}

class Laptop extends Computer {
    
    private final int weight;
    public Laptop(String ssd, String ram, int weight) {
        // constructor from the superclass
        super(ssd, ram);
        // custom fields, this is a reference to the current object
        this.weight = weight;
        final String ssd1 = getSsd();
    }

    public int getWeight() {
        return weight;
    }

    public void open() {
//        System.out.println("Open laptop");
    }
}