package StringProblem;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        int count = 0;

        for(int i = 0 ; i < strArr.length ; i++){
            if(!strArr[i].equals("")) count++;
        }
        System.out.print(count);
    }
}
