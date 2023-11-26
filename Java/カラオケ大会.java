import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //歌う人数
        int n = sc.nextInt(); 
        //課題曲の長さ
        int m = sc.nextInt(); 

        //課題曲の正しい音程を格納する配列
        int[] correctPitch = new int[m]; 
        for (int i = 0; i < m; i++) {
            correctPitch[i] = sc.nextInt();
        }

        //最高得点を格納する変数
        int score_max = 0; 

        
        //各人の得点を計算する
        for (int i = 0; i < n; i++) {
        //初期得点は 100 点
            int score = 100; 
            for (int j = 0; j < m; j++) {
                //i 番目の人が j 番目の小節で歌った音程
                int pitch = sc.nextInt(); 
                //誤差を計算する
                int error = Math.abs(pitch - correctPitch[j]); 
                //誤差 5 Hz 以内なら減点しない
                if (error <= 5) {
                    
                //誤差 10 Hz 以内なら 1 点減点
                } else if (error <= 10) {
                    score -= 1; 
                //誤差 20 Hz 以内なら 2 点減点
                } else if (error <= 20) {
                    score -= 2; 
                //誤差 30 Hz 以内なら 3 点減点
                } else if (error <= 30) {
                    score -= 3; 
                //上記に当てはまらない場合、5 点減点
                } else {
                    score -= 5; 
                }
            }
            //最高得点を更新する
            score_max = Math.max(score_max, score); 
        }

        //最高得点を出力する
        System.out.println(score_max); 
    }
}