import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int d = kb.nextInt();
        if(m<2){
            System.out.println("Before");
        } else if(m>2){
            System.out.println("After");
        }
        if(m==2){
            if(d <18){
                System.out.println("Before");
            } else if(d>18){
                System.out.println("After");
            } else if(d==18){
                System.out.println("Special");
            }
        }
    }
}