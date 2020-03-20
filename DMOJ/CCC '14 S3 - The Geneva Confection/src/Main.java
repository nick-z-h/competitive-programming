import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for(int i = 0; i<T; i++){
            boolean flag = true;
            int N = kb.nextInt();
            Stack<Integer> M = new Stack<>();
            Stack<Integer> B = new Stack<>();
            for(int j = 0; j<N; j++){
                M.push(kb.nextInt());
            }
            int c = 1;
            while(c <= N){
                if(M.size() > 0 && M.peek() == c){
                    M.pop();
                    c++;
                } else if(B.size() > 0 && B.peek() == c){
                    B.pop();
                    c++;
                } else if(M.size()>0){
                    B.push(M.pop());
                } else {
                    System.out.println("N");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Y");
            }
        }
    }
}