import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int D = kb.nextInt();
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        for(int i = 0; i<S-1; i++){
            System.out.print("    ");
        }
        for(int i = 1; i< D+1; i++){
            if(i<10){
                if((i+S-1)%7 == 0){
                    System.out.print("  " + i);
                    } else {
                        System.out.print("  " + i + " ");
                    }
                } else {
                    if(i == D || (i+S-1)%7 == 0) {
                        System.out.print(" " + i);
                    } else {
                        System.out.print(" " + i + " ");
                    }
                }
            if((i+S-1)%7 == 0){
                System.out.print("\n");
            }
        }
        if(D%7 != 0){
            System.out.print("\n");
        }
    }
}