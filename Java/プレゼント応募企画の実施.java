import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        //N分ループ
        for(int i=1; i<=N; i++) {
            //AB当選_応募者がXかYの倍数
            if(i % X == 0 && i % Y == 0) {
                System.out.println("AB");
            }
            //A当選_応募者がXの倍数
            else if(i % X == 0) {
                System.out.println("A");
            }
            //B当選_応募者がYの倍数
            else if(i % Y == 0) {
                System.out.println("B");
            }
            //当選なし
            else {
                System.out.println("N");
            }
        }
    }
}