import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year = kb.nextInt();
        boolean flag = true;
        do {
            year++;
            flag = false;
            String temp = Integer.toString(year);
            char[] yearArr = temp.toCharArray();
            for(int i=0; i< yearArr.length; i++){
                for(int j=i+1; j < yearArr.length; j++){
                    if(yearArr[i] == yearArr[j]){
                        flag = true;
                    }
                }
            }
        } while(flag);
        System.out.println(year);
    }
}