package RuleProblem;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < i + 1 ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
