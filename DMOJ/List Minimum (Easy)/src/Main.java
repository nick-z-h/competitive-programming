import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for(int i=0; i<N; i++){
            System.out.print(i+1 + " ");
        }
    }
}