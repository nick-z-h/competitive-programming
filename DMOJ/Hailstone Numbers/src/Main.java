import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int C = 0;
        while(N!=1) {
            C++;
            if(N%2==0){
                N /= 2;
            } else {
                N = N*3 + 1;
            }
        }
        System.out.println(C);
    }
}