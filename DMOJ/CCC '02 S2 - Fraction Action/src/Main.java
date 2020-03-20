import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int D = kb.nextInt();
        if(N==0){
            System.out.println(N);
        } else {
            if(N%D==0){
                System.out.println(N/D);
            } else {
                if(N>D){
                    int GCD = GCD(N,D);
                    System.out.print(N/D);
                    N = N-(N/D)*D;
                    N = N/GCD;
                    D = D/GCD;
                    System.out.print(" " + N + "/" + D);
                } else {
                    int GCD = GCD(N,D);
                    N = N/GCD;
                    D = D/GCD;
                    System.out.print(N + "/" + D);
                }
            }
        }
    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        } else {
            return GCD(b,a%b);
        }
    }
}