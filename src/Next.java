import java.io.*;

public class Next {
    //3. Два в одном
    //
    //Считать с консоли 3 имени файла
    //Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
    //Закрыть потоки. Не использовать try-with-resources
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("text3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("totalText.txt",true));

        String line;
        while ((line = br.readLine())!=null) {
            bw.write(line+"\n");
        }
        br.close();

        line = " ";
        while ((line = br3.readLine()) != null) {
            bw.write(line+"\n");
        }
        br3.close();
        bw.close();


    }
}
