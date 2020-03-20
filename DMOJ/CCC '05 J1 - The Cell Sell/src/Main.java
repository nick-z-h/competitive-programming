import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int D = kb.nextInt();
        int E = kb.nextInt();
        int W = kb.nextInt();
        double dp = 0;
        double ep = 0;
        double wp = 0;
        if(D <= 100){
            dp = 0;
        } else {
            dp = (D-100)*0.25;
        }
        ep = E*0.15;
        wp = W*0.2;
        double planA = Math.round((dp+ep+wp)*100.0)/100.0;
        System.out.println("Plan A costs " + planA);
        if(D <= 250){
            dp = 0;
        } else {
            dp = (D - 250)*0.45;
        }
        ep = E*0.35;
        wp = W*0.25;
        double planB = Math.round((dp+ep+wp)*100.0)/100.0;
        System.out.println("Plan B costs " + planB);
        if(planA>planB){
            System.out.println("Plan B is cheapest.");
        } else if(planA<planB){
            System.out.println("Plan A is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
        }
    }
}
