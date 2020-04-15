import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner((System.in));
        for(int g = 0; g < 10; g++) {
            double W1 = kb.nextInt();
            double W2 = kb.nextInt();
            double W3 = kb.nextInt();
            double W4 = kb.nextInt();
            int N = kb.nextInt();
            int c = 0;
            for(int i = 0; i < N; i++) {
                double M1 = kb.nextDouble()*1000;
                double M2 = kb.nextDouble()*1000;
                double M3 = kb.nextDouble()*1000;
                double M4 = kb.nextDouble()*1000;
                double a = ((M1 * (W1/100) + M2 * (W2/100) + M3 * (W3/100) + M4 * (W4/100)));
                if(a >= 50*1000) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
