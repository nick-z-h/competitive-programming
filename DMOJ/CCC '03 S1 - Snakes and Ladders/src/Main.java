import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int wp = 100;
        int cp = 1;
        boolean flag = true;
        int r;
        do {
            r = kb.nextInt();
            if(r>1){
                cp += r;
                if(cp == 9){
                    cp = 34;
                }
                if(cp == 40){
                    cp = 64;
                }
                if(cp == 67){
                    cp = 86;
                }
                if(cp == 54){
                    cp = 19;
                }
                if(cp == 90){
                    cp = 48;
                }
                if(cp == 99){
                    cp = 77;
                }
                if(cp > 100){
                    cp -= r;
                }
                System.out.println("You are now on square " + cp);
                if(cp == 100){
                    System.out.println("You Win!");
                    break;
                }
            } else {
                flag = false;
                System.out.println("You Quit!");
            }
        }while(flag==true);
    }
}
