import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int H = kb.nextInt();
        String A = "";
        String B = "";
        for(int i = H; i > 1; i-=2){
            for(int g = i; g <= H; g++ ) {
                System.out.print("*");
            }
            for(int g = (i*2-3); g>=0; g--) {
                System.out.print(" ");
            }
            for(int g = i; g <= H; g++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i = 1; i <= H; i+=2){
            for(int g = i; g <= H; g++){
                System.out.print("*");
            }
            for(int g = 0; g<(i-1)*2; g++) {
                System.out.print(" ");
            }
            for(int g = i; g <= H; g++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}