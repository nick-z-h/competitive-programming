import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for(int i = 0; i<N; i++){
            int R = kb.nextInt();
            if(R>=4000){
                System.out.println("Rainbow Master");
            } else if(R>=3000){
                System.out.println("Target");
            } else if(R>=2200){
                System.out.println("Grandmaster");
            } else if(R>=1800){
                System.out.println("Master");
            } else if(R>=1500){
                System.out.println("Candidate Master");
            } else if(R>=1200){
                System.out.println("Expert");
            } else if(R>=1000){
                System.out.println("Amateur");
            } else if(R<1000){
                System.out.println("Newbie");
            }
        }
    }
}