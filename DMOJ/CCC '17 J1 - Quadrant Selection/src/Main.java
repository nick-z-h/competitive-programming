import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        if(Math.abs(x) == x && Math.abs(y) == y){
            System.out.println("1");
        }
        if(Math.abs(x) != x && Math.abs(y) == y){
            System.out.println("2");
        }
        if(Math.abs(x) != x && Math.abs(y) != y){
            System.out.println("3");
        }
        if(Math.abs(x) == x && Math.abs(y) != y){
            System.out.println("4");
        }
    }
}