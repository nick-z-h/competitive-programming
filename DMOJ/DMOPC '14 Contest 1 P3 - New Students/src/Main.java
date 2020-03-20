import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int I = kb.nextInt();
        double[] iMarks = new double[I];
        for(int i = 0; i<I; i++){
            iMarks[i] = kb.nextInt();
        }
        int F = kb.nextInt();
        double[] fMarks = new double[F];
        for(int i = 0; i<F; i++){
            fMarks[i]=kb.nextInt();
        }
        double N = 0;
        for(int i = 0; i<iMarks.length; i++){
            N+=iMarks[i];
        }
        for(int i = 0; i<fMarks.length; i++){
            N+= fMarks[i];
            double average = N/(double)(iMarks.length + i + 1);
            System.out.format("%.3f", average);
            System.out.println();
        }
    }
}