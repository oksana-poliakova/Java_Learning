package Practice.Reflection;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */

@Table(name = "cars")
class CarReflection {
    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    public CarReflection(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}