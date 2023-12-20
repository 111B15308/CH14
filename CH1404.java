import java.io.FileReader;
import java.io.IOException;

public class CH1404{
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("donkey.txt")) {
            int character;
            int characterCount = 0;

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
                characterCount++;
            }

            System.out.println("\n讀取的字元數: " + characterCount);
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
