import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CH1408{
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("proverb.txt"));
            Reader reader = new StringReader(omitString(bufferedReader, "You cant be perfect but you can be unique."));
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }

    static String omitString(BufferedReader bufferedReader, String omit) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (!line.contains(omit)) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
}
