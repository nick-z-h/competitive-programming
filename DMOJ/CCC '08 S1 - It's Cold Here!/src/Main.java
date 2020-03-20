import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> temps = new ArrayList<>();
        String C = kb.next();
        cities.add(C);
        temps.add(kb.nextInt());
        while(!C.equals("Waterloo")) {
            C = kb.next();
            cities.add(C);
            temps.add(kb.nextInt());
        }
        int l = 200;
        int j = 0;
        for(int i = 0; i < cities.size(); i++) {
            if(temps.get(i) < l) {
                l = temps.get(i);
                j = i;
            }
        }
        System.out.println(cities.get(j));
    }
}