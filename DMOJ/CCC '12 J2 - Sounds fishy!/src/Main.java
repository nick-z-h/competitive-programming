import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();
        if(a<b && b<c && c<d){
            System.out.println("Fish Rising");
        }else if(a>b && b>c && c>d){
            System.out.println("Fish Diving");
        }else if(a==b && b==c && c==d){
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
