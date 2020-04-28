import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] r = new int[1001];
        int[] a = new int[1001];
        for(int i = 0; i < n; i++) {
            int t = kb.nextInt();
            r[t]++;
            a[t]++;
        }
        Arrays.sort(r);
        int f = r[1000];
        int s = r[999];
        if( f == s ) {
            int t1 = 0;
            int t2 = 0;
            for(int i = 1000; i > 0; i--) {
                if(a[i] == f) {
                    t1 = i;
                }
            }
            for(int i = 0; i < 1001; i++) {
                if(a[i] == s) {
                    t2 = i;
                }
            }
            System.out.println(t2 - t1);
        } else {
            ArrayList<Integer> x = new ArrayList<>();
            ArrayList<Integer> y = new ArrayList<>();
            for(int i = 1000; i > 0; i--) {
                if(a[i] == f) {
                    x.add(i);
                }
                if(a[i] == s) {
                    y.add(i);
                }
            }
            Collections.sort(x);
            Collections.sort(y);
            if(x.size() > 1) {
                System.out.println(Math.abs(x.get(0) - x.get(x.size() - 1)));
            } else {
                System.out.println(Math.max(Math.abs(y.get(0) - x.get(x.size()-1)), Math.abs(y.get(y.size()-1) - x.get(0))));
            }
        }
    }
}
