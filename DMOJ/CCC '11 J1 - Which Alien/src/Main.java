import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int aCount = kb.nextInt();
        int eCount = kb.nextInt();
        if(eCount<=4 && aCount>=3){
            System.out.println("TroyMartian");
        }
        if(eCount>=2 && aCount<=6){
            System.out.println("VladSaturnian");
        }
        if(eCount<=3 && aCount<=2){
            System.out.println("GraemeMercurian");
        }
    }
}