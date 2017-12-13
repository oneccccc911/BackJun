package StringProblem;/*
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,

kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] inputArr = new String[n];

        int count = 0;

        for(int i = 0 ; i < n ; i++){
            inputArr[i] = sc.nextLine();
            boolean group = true;

            int[] arr = new int[26];
            Arrays.fill(arr, 0);

            for(int j = 0 ; j < inputArr[i].length() ; j++) {
                if(j == 0) {
                    //첫번째 알파벳 검사
                    arr[(int) inputArr[i].charAt(j) - (int)'a']++;
                    continue;
                }else{
                    //첫번째가 아닐 때
                    if(inputArr[i].charAt(j) == inputArr[i].charAt(j-1))
                        //직전 알파벳이랑 같을 경우
                        arr[(int) inputArr[i].charAt(j) - (int)'a']++;
                    else{
                        //직전 알파벳과 다른 경우
                        if(arr[(int) inputArr[i].charAt(j) - (int)'a'] > 0){
                            //직전 알파벳과 다른데 이미 한번 나온 경우
                            group = false;
                            break;
                        }
                        else{
                            //직전 알파벳과 다른데 처음 나온 경우
                            arr[(int) inputArr[i].charAt(j) - (int)'a']++;
                        }
                    }
                }
            }
            if(group == true)
                count++;
        }
        System.out.print(count);
    }
}
