import java.io.Serializable;

public class Human implements Serializable {
    final static double serialVersionUID = 1.0;
    String name;
    int age;
    double height;
    transient double weight;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
