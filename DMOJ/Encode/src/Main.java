import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int shift = Integer.parseInt(kb.nextLine())*-1;
        if(shift<-26 || shift > 26) {
            shift = shift%26;
        }
        String N = kb.nextLine();
        System.out.println(decrypt(N, shift));
    }
    static String decrypt(String str, int shift) {
        String dStr = "";
        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == 32) {
                int j = str.charAt(i);
                dStr += (char)j;
                continue;
            }
            if(str.charAt(i) > 96) {
                int j = str.charAt(i) + shift;
                if (j > 122) {
                    j -= 26;
                } else if (j < 97) {
                    j += 26;
                }
                dStr += (char)j;
                continue;
            }
            int j = str.charAt(i) + shift;
            if (j > 90) {
                j -= 26;
            } else if (j < 65) {
                j += 26;
            }
            dStr += (char)j;
        }
        return dStr;
    }
}