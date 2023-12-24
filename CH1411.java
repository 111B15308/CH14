import java.io.*;

public class CH1411{
    public static void writeData() {
        try (FileOutputStream fos = new FileOutputStream("rand99.txt")) {
            for (int i = 0; i < 100; i++) {
                char randomChar = (char) ('a' + (int) (Math.random() * 26));
                fos.write(randomChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void count() {
        try (FileInputStream fis = new FileInputStream("rand99.txt")) {
            int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
            int data;
            while ((data = fis.read()) != -1) {
                char character = (char) data;
                switch (character) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                }
            }

            System.out.println("Count of 'a': " + aCount);
            System.out.println("Count of 'e': " + eCount);
            System.out.println("Count of 'i': " + iCount);
            System.out.println("Count of 'o': " + oCount);
            System.out.println("Count of 'u': " + uCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeData();
        count();
    }
}
