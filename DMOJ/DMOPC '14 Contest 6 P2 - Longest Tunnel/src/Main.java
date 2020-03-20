import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int longest = 0;
        int s,r;
        for(int i = 0; i < n; i++){
            s = kb.nextInt();
            r = kb.nextInt();
            if(r-s> longest){
                longest = r - s;
            }
        }
        System.out.println(longest);
    }
}