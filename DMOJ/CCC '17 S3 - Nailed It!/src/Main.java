import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] w = new int[2001];
        int[] b = new int[4001];
        for(int i = 0; i<N; i++){
            w[kb.nextInt()]++;
        }
        for(int i=1; i<w.length;i++){
            if(w[i]!=0){
                b[i*2]+=w[i]/2;
                for(int j=i+1;j<w.length;j++){
                    if(w[j]!=0){
                        b[i+j]+=Math.min(w[i],w[j]);
                    }
                }
            }
        }
        int l = 0;
        int h = 0;
        for(int i = 0;i<b.length;i++){
            if(b[i]>h){
                h=b[i];
                l=1;
            }else if(b[i]==h){
                l++;
            }
        }
        System.out.println(h+" "+l);
    }
}
