import java.io.FileWriter;
import java.io.IOException;

public class CH1406 {
    public static void main(String[] args) {
        char hi[] = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        try (FileWriter fileWriter = new FileWriter("hello.txt")) {
            for (char c : hi) {
                fileWriter.write(c);
            }

            System.out.println("成功將字元寫入檔案 hello.txt");
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
        }
    }
}
