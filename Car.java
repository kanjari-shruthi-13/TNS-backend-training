// Car.java
/**
 * Represents a car with basic details such as model, type, and speed.
 */
public class Car {

    // Instance variables (Encapsulated)
    int speed;
    String model;
    String type;

    // Constructor
    public Car(String model, String type, int speed) {
        this.model = model;
        this.type = type;
        this.speed = speed;
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method to start the car
    public void start() {
        System.out.println("🚗 Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " km/h");
    }
}
