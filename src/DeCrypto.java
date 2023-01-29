import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeCrypto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Human> hl = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Human_list.bin"));) {

            hl = (List<Human>) ois.readObject();
        }


        System.out.println(hl);
    }
}
