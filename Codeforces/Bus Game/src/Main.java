import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        while(true) {
            if(x>=2 && y>=2) {
                x-=2;
                y-=2;
            } else if(x>=1 && y>=12) {
                x--;
                y-=12;
            } else if(y>=22) {
                y-=22;
            } else {
                System.out.println("Hanako");
                break;
            }
            if(y>=22) {
                y-=22;
            } else if(x>=1 && y>= 12) {
                x--;
                y-=12;
            } else if(x>=2 && y>=2) {
                x-=2;
                y-=2;
            } else {
                System.out.println("Ciel");
                break;
            }
        }
    }
}
