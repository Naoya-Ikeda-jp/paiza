import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // N個の「*」を繋げた文字列を作成する
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        
        // 文字列を出力し、最後に改行する
        System.out.println(sb.toString());
    }
}