import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int aScore = kb.nextInt()*3 + kb.nextInt()*2 + kb.nextInt();
        int bScore = kb.nextInt()*3 + kb.nextInt()*2 + kb.nextInt();
        if(aScore>bScore){
            System.out.println("A");
        } else if(aScore == bScore){
            System.out.println("T");
        } else {
            System.out.println("B");
        }
    }
}
