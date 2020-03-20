import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cNum = kb.nextInt();
        int c = 0;
        for(int i = 0; i < cNum; i++){
            for(int g = 0; g< cNum; g++){
                if(i != g){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}