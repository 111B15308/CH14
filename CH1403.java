import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH1403 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("請輸入一個整數 n: ");
            int n = Integer.parseInt(reader.readLine());
            int sum = calculateSum(n);
            System.out.println("1+2+...+" + n + " 的和為: " + sum);
        } catch (IOException e) {
            System.out.println("輸入錯誤：" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("請輸入有效的整數");
        }
    }

    static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
