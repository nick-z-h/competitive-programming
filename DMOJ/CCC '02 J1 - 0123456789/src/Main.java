import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        if (N == 0) {
            System.out.println(" * * *\n*     *\n*     *\n*     *\n\n*     *\n*     *\n*     *\n * * *");
        }
        if(N == 1){
            System.out.println("\n      *\n      *\n      *\n\n      *\n      *\n      *");
        }
        if(N == 2){
            System.out.println(" * * *\n      *\n      *\n      *\n * * *\n*\n*\n*\n * * *");
        }
        if(N == 3){
            System.out.println(" * * *\n      *\n      *\n      *\n * * *\n      *\n      *\n      *\n * * *");
        }
        if(N == 4){
            System.out.println("*     *\n*     *\n*     *\n * * *\n      *\n      *\n      *");
        }
        if(N == 5){
            System.out.println(" * * *\n*\n*\n*\n * * *\n      *\n      *\n      *\n * * *");
        }
        if(N == 6){
            System.out.println(" * * *\n*\n*\n*\n * * *\n      *\n      *\n      *\n * * *");
        }
        if(N == 7){
            System.out.println(" * * *\n      *\n      *\n      *\n\n      *\n      *\n      *");
        }
        if(N == 8){
            System.out.println(" * * *\n*     *\n*     *\n*     *\n * * *\n*     *\n*     *\n*     *\n * * *");
        }
        if(N == 9){
            System.out.println(" * * *\n*     *\n*     *\n*     *\n * * *\n      *\n      *\n      *\n * * *");
        }
    }
}