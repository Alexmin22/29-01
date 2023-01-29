import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    //1. Английские буквы
    //
    //В метод main первым параметром приходит имя файла.
    //Посчитать количество букв английского алфавита, которое есть в этом файле.
    //Вывести на экран число (количество букв)
    //Закрыть потоки. Не использовать try-with-resources
    //2. Пробелы
    //
    //В метод main первым параметром приходит имя файла.
    //Вывести на экран частоту встречания пробела. Например, 10.45
    //1. Посчитать количество всех символов.
    //2. Посчитать количество пробелов.
    //3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
    //4. Закрыть потоки. Не использовать try-with-resources
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text.txt");

        int i;
        int vowel = 0;
        int count = 0;
        int probel = 0;
        while ((i= fr.read()) != -1) {
            count++;
            if ((i>=65 && i<=90) || (i>=97 && i<=122)) {
                vowel++;
            } else if (i == 32) {
                probel++;
            }
        }
        fr.close();

        String form = new DecimalFormat("#0.00").format((double) probel/count*100);

        System.out.println("Гласных букв в тексте "+vowel);
        System.out.println("Всего символов "+count+", из них пробелов "+probel+
                ", что составляет "+form+" процентов");
    }
}