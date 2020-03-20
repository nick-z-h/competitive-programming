import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int c = kb.nextInt();
        kb.nextLine();
        String X = kb.nextLine();
        int ac = 0;
        for(int i = 0; i<c; i++){
            if(X.charAt(i) == 'A'){
                ac++;
            }
        }
        if(ac>c-ac){
            System.out.println("A");
        } else if(ac<c-ac){
            System.out.println("B");
        }
        if(ac==c-ac){
            System.out.println("Tie");
        }
    }
}