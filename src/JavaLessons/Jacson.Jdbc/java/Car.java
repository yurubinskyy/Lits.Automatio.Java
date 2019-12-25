import java.io.Serializable;

public class Car implements Serializable {
    private String color;
    private String type;

    public Car(){}


    public Car(String color, String type) {
        this.color = color;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
