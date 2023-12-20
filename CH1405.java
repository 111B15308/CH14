import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CH1405{
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("donkey.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            int character;
            int characterCount = 0;

            String line;
            boolean ignoreLine = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("我有一隻小毛驢")) {
                    ignoreLine = true;
                    continue;
                }

                if (!ignoreLine) {
                    for (char c : line.toCharArray()) {
                        System.out.print(c);
                        characterCount++;
                    }
                    System.out.println();  // 換行
                }
            }

            System.out.println("\n讀取的字元數: " + characterCount);
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
