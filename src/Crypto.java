import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Crypto {
    public static void main(String[] args) throws IOException {
        Human num1 = new Human("Petr", 20, 2.01, 90.4);
        Human num2 = new Human("Stepan", 30, 1.75, 82.1);
        Human num3 = new Human("Alexey", 44, 1.62, 60.6);
        Human num4 = new Human("Sveta", 35, 1.60, 53.7);
        Human num5 = new Human("Olya", 16, 1.55, 42.0);

        List<Human> humanList = new ArrayList<>();
        humanList.add(num1);
        humanList.add(num2);
        humanList.add(num3);
        humanList.add(num4);
        humanList.add(num5);

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("Human_list.bin"));) {

            ous.writeObject(humanList);
        }

    }
}
