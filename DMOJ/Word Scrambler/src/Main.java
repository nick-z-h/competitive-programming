import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        printP(str,"");
        Collections.sort(list);
        for(String i : list){
            System.out.println(i);
        }

    }
    public static void printP(String str, String t){
        if(str.length() == 0){
            list.add(t);
        }
        for(int i = 0; i< str.length(); i++){
            char s = str.charAt(i);
            String nS = str.substring(0,i)+str.substring(i+1);
            printP(nS, t + s);
        }
    }
}