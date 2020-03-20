import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cQ = kb.nextInt();
        int q1 = kb.nextInt();
        int q2 = kb.nextInt();
        int q3 = kb.nextInt();

        int C = 0;

        while(cQ>0) {
            cQ--;
            C++;
            q1++;
            if(q1 == 35) {
                q1 = 0;
                cQ += 30;
            }
            if(cQ == 0) {
                break;
            }

            cQ--;
            C++;
            q2++;
            if(q2 == 100) {
                q2 = 0;
                cQ += 60;
            }
            if(cQ == 0) {
                break;
            }

            cQ--;
            C++;
            q3++;
            if(q3 == 10) {
                q3 = 0;
                cQ += 9;
            }
        }
        System.out.println("Martha plays " + C + " times before going broke.");
    }
}
