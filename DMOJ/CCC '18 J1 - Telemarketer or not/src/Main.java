import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] N = new int[4];
        for(int i = 0; i<N.length; i++){
            N[i] = kb.nextInt();
        }
        if((N[0] != 8 && N[0] != 9) || (N[1] != N[2]) || (N[3] != 8 && N[3] != 9)){
            System.out.println("answer");
        } else {
            System.out.println("ignore");
        }
    }
}
