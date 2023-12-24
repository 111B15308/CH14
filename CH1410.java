import java.io.*;

public class CH1410{
    private String name;
    private int english;
    private int math;

    // (a) 有引數的建構子
    public Data(String str, int e, int m) {
        this.name = str;
        this.english = e;
        this.math = m;
    }

    // (b) 將物件資料寫入 student.txt
    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
            writer.write(name + " " + english + " " + math);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // (c) 顯示資料及平均分數
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

    // (d) 讀取 student.txt 資料並顯示
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                int english = Integer.parseInt(data[1]);
                int math = Integer.parseInt(data[2]);

                // 建立 Data 物件
                Data student = new Data(name, english, math);

                // 顯示資料
                student.show();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // (e) 建立學生物件並寫入 student.txt
        Data stu1 = new Data("Ariel", 92, 85);
        stu1.writeData();

        Data stu2 = new Data("Fiona", 67, 89);
        stu2.writeData();

        // (f) 讀取 student.txt 資料並顯示
        readData();
    }
}
