import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int wc = 0;
        for(int i = 0; i<6; i++){
            String t = kb.nextLine();
            if(t.equals("W")){
                wc++;
            }
        }
        if(wc>=5){
            System.out.println("1");
        }
        if(wc == 3 || wc == 4 ){
            System.out.println("2");
        }
        if(wc == 2|| wc == 1){
            System.out.println("3");
        }
        if(wc == 0){
            System.out.println("-1");
        }
    }
}
