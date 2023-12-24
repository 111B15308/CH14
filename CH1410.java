import java.io.*;

public class CH1410{
    private String name;
    private int english;
    private int math;

    public Data(String str, int e, int m) {
        this.name = str;
        this.english = e;
        this.math = m;
    }

    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
            writer.write(name + " " + english + " " + math);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("English Score: " + english);
        System.out.println("Math Score: " + math);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println();
    }

    // 計算平均分數
    private double calculateAverage() {
        return (english + math) / 2.0;
    }

    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                int english = Integer.parseInt(data[1]);
                int math = Integer.parseInt(data[2]);

                Data student = new Data(name, english, math);

                student.show();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Data stu1 = new Data("Ariel", 92, 85);
        stu1.writeData();

        Data stu2 = new Data("Fiona", 67, 89);
        stu2.writeData();

        // (f) 讀取 student.txt 資料並顯示
        readData();
    }
}
