import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double W = kb.nextDouble();
        double H = kb.nextDouble();
        double b = W/(H*H);
        if(b<18.5){
            System.out.println("Underweight");
        } else if (b>25){
            System.out.println("Overweight");
        } else{
            System.out.println("Normal weight");
        }
    }
}