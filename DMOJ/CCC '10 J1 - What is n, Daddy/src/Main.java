import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        if(N == 4 || N == 5 || N ==6){
            System.out.println("3");
        }
        if(N == 2 || N == 3 || N == 7|| N ==8){
            System.out.println("2");
        }
        if(N == 1 || N == 9 || N ==10){
            System.out.println("1");
        }
    }
}