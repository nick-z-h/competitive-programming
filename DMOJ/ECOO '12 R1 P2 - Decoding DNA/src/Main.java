import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            String s = kb.next();
            int st = s.indexOf("TATAAT") + 10;
            s = s.substring(st);
            System.out.println(i+1 + ": " + getRNA(getComp(s.substring(0, f(s)))));
        }
    }
    static int f(String s) {
        for(int i = 0; i < s.length() - 6; i++) {
            for(int j = i + 6; j < s.length(); j++) {
                String c = s.substring(i, j);
                String t = s.substring(j);
                if(t.contains(getRev(c))) {
                    return i;
                }
            }
        }
        return -1;
    }
    static String getRev(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'G' : {
                    c ='C';
                    break;
                }
                case 'C' : {
                    c = 'G';
                    break;
                }
                case 'A' : {
                    c = 'T';
                    break;
                }
                case 'T': {
                    c = 'A';
                    break;
                }
                default: {
                    c = 'x';
                    break;
                }
            }
            sb.append(c);
        }
        return sb.reverse().toString();
    }
    static String getRNA(String s) {
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'T') {
                t += "U";
            } else {
                t += s.charAt(i);
            }
        }
        return t;
    }
    static String getComp(String s) {
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'G' : {
                    c ='C';
                    break;
                }
                case 'C' : {
                    c = 'G';
                    break;
                }
                case 'A' : {
                    c = 'T';
                    break;
                }
                case 'T': {
                    c = 'A';
                    break;
                }
                default: {
                    c = 'x';
                    break;
                }
            }
            t += c;
        }
        return t;
    }
}