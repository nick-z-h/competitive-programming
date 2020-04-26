import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] l = new int[5];
        for(int i = 0; i < 5; i++) {
            l[i] = kb.nextInt();
        }
        int c = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < 4; j++) {
                for(int g = j+1; g < 5; g++) {
                    if(v(l[i],l[j],l[g])) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
    static boolean v(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}