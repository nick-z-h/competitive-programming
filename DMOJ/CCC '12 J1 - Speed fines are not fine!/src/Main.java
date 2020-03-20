import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int S = kb.nextInt();
        if(S-N<=0){
            System.out.println("Congratulations, you are within the speed limit!");
        } else if(S-N>0){
            if(S-N<=20){
                System.out.println("You are speeding and your fine is $100.");
            } else if (S-N<= 30){
                System.out.println("You are speeding and your fine is $270.");
            } else if (S-N>=31){
                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}