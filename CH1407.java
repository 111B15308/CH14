import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CH1407{
    public static void main(String[] args) {
        char hi[] = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        try (FileWriter fileWriter = new FileWriter("hello.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             FileReader fileReader = new FileReader("hello.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            bufferedWriter.newLine();
            bufferedWriter.write("Welcome!");

            System.out.println("成功將字串 Welcome! 寫入檔案 hello.txt");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("寫入或讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
