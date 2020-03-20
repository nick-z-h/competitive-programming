import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        kb.nextLine();
        String M = kb.nextLine();
        String D = "";
        for(int i = 0; i<M.length(); i++){
            int G = 3*(i+1)+S;
            char MC = M.charAt(i);
            int X = MC - G;
            if(X <65){
                X+=26;
            }
            char N  = (char)X;
            D+=N;
        }
        System.out.println(D);
    }
}