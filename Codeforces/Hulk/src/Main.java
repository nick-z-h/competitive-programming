import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String a = "";
        for(int i = 0; i < n; i++) {
            if(i!=0) {
                a += " that ";
            }
            if(i%2 == 0) {
                a += "I hate";
            } else {
                a += "I love";
            }
        }
        a += " it";
        System.out.print(a);
    }
}