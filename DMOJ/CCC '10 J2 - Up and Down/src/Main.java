import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();
        int s = kb.nextInt();
        int np = 0;
        int bp = 0;
        int nc = a;
        int bc = c;
        boolean nf = true;
        boolean bf = true;
        for(int i = 0; i<s; i++){
            if(bc==0){
                if(bf){
                    bf=false;
                    bc=d;
                }else{
                    bf=true;
                    bc=c;
                }
            }
            if(nc==0){
                if(nf){
                    nf=false;
                    nc=b;
                }else{
                    nf=true;
                    nc=a;
                }
            }
            if(bf){
                bp++;
            }else{
                bp--;
            }
            bc--;
            if(nf){
                np++;
            }else{
                np--;
            }
            nc--;
        }
        if(bp>np){
            System.out.println("Byron");
        } else if(np>bp){
            System.out.println("Nikky");
        } else {
            System.out.println("Tied");
        }
    }
}