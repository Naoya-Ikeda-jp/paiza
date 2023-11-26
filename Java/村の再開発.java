import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    // 入力
        // 毎月増加する人数
        int X = scanner.nextInt();
        // 何か月後の人口を求めるか
        int Y = scanner.nextInt(); 
        
    // 計算
        // Yヶ月後の人口を計算する
        int population = 100 + X * Y;
        
    // 出力
        // 結果を出力し、最後に改行する
        System.out.println(population);
    }
}