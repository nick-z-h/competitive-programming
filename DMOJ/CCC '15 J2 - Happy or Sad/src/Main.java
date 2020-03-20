import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String N = kb.nextLine();
        int hc = 0;
        int sc = 0;
        if(N.length()>2){
            for(int i = 0; i<N.length()-2; i++){
                if(N.charAt(i) == ':' && N.charAt(i+1) == '-' && N.charAt(i+2) == ')'){
                    hc++;
                }
                if(N.charAt(i) == ':' && N.charAt(i+1) == '-' && N.charAt(i+2) == '('){
                    sc++;
                }
            }
        }
        if(hc>sc){
            System.out.println("happy");
        } else if (hc==sc && hc + sc > 0) {
            System.out.println("unsure");
        } else if (sc>hc){
            System.out.println("sad");
        } else {
            System.out.println("none");
        }
    }
}
