import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個字串: ");
        String inputString = scanner.nextLine();
        String upperString = inputString.toUpperCase();
        System.out.println(upperString);
    }
}
