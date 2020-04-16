import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        if(n == 1) {
            if(a[n-1] == 15) {
                System.out.println("DOWN");
            } else if(a[n-1] == 0) {
                System.out.println("UP");
            } else {
                System.out.println("-1");
            }
        } else if(n==2) {
            if(a[n-2]==a[n-1]) {
                System.out.println(-1);
            } else if(a[n-1] == 0) {
                System.out.println("UP");
            } else if(a[n-2] > a[n-1] || a[n-1] == 15) {
                System.out.println("DOWN");
            } else {
                System.out.println("UP");
            }
        } else {
            if(a[n - 1] == 15) {
                System.out.println("DOWN");
            } else if(a[n - 1] == 0) {
                System.out.println("UP");
            } else if(a[n - 2] > a[n - 1]) {
                System.out.println("DOWN");
            } else {
                System.out.println("UP");
            }
        }
    }
}
