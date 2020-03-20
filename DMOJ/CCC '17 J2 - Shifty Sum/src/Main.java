import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int T = kb.nextInt();
        int r = N;
        while(T>0){
            int q = (int)Math.pow(10, T);
            N+= r*q;
            T--;
        }
        System.out.println(N);
    }
}