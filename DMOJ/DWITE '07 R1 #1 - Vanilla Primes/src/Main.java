import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        boolean flag = false;
        for(int i = 2; i<= N/2; i++){
            if(N%i == 0){
                flag = true;
                break;
            }
        }
        if(N < 2){
            System.out.println("not");
        } else if(!(flag)){
            System.out.println("prime");
        } else {
            System.out.println("not");
        }
    }
}
