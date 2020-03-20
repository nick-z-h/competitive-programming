import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int s = 9;
        int l = 0;
        for(int i = 0; i<N; i++){
            int x = kb.nextInt();
            if(x<s){
                s = x;
            } else if(x>l){
                l = x;
            }
        }
        System.out.println(l-s);
    }
}