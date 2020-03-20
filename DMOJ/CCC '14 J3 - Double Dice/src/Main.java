import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int p1 = 100;
        int p2 = 100;
        int N = kb.nextInt();
        for(int i = 0; i<N; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            if(a>b){
                p2 -= a;
            } else if(b>a){
                p1 -= b;
            }
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
