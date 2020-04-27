import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Double> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(kb.nextDouble());
        }
        while(true) {
            int t = kb.nextInt();
            if(t==77) {
                break;
            } else if(t==99) {
                int i = kb.nextInt() -1;
                double p = kb.nextDouble();
                a.add(i + 1, a.get(i) * ((100-p)/100.0));
                a.set(i, a.get(i) * (p/100.0));
            } else if(t==88) {
                int i = kb.nextInt() -1;
                a.set(i, a.get(i) + a.get(i+1));
                a.remove(i+1);
            }
        }
        for (Double i : a) {
            System.out.print(Math.round(i) + " ");
        }
    }
}
