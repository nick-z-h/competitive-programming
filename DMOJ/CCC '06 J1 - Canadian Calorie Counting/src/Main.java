import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] c = {{461,431,420,0}, {100,57,70,0}, {130,160,118,0}, {167,266,75,0}};
        int t = 0;
        for(int i = 0; i<4; i++){
            int temp = kb.nextInt()-1;
            t+=c[i][temp];
        }
        System.out.println("Your total Calorie count is " + t + ".");
    }
}
