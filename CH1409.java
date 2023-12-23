import java.io.*;

public class CH1409{
    public static void main(String[] args) {
        String aaaContent = readFile("aaa.txt");
        String bbbContent = readFile("bbb.txt");  
        String cccContent = aaaContent + "\n" + bbbContent;
        writeFile("ccc.txt", cccContent);

        System.out.println(aaaContent);
        System.out.println(bbbContent);
        System.out.println(cccContent);
    }


    private static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString().trim(); 
    }

    private static void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
