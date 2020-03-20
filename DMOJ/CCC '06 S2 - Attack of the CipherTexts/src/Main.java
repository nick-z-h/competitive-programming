import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String A = kb.nextLine();
        String B = kb.nextLine();
        String C = kb.nextLine();
        for(int i = 0; i<C.length(); i++){
            char ch = C.charAt(i);
            int in = B.indexOf(ch);
            if(in == -1){
                System.out.print(".");
            } else {
                System.out.print(A.charAt(in));
            }
        }
    }
}