package StringProblem;/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] alphaArr = new int[26];
        Arrays.fill(alphaArr, 0);

        for(int i = 0 ; i < str.length() ; i++){
            int idx = (int) str.charAt(i) - (int) 'A';

            if(idx < 26) {
                alphaArr[idx]++;
            }
            else{
                alphaArr[idx + (int) 'A' - (int) 'a']++;
            }
        }

        int max = alphaArr[0];
        int idx = 0;

        for(int i = 1 ; i < alphaArr.length ; i++){
            if(alphaArr[i] > max) {
                max = alphaArr[i];
                idx = i;
            }
        }

        int count = 0;

        for(int i = 0 ; i < alphaArr.length ; i++){
            if(alphaArr[i] == max)
                count++;
            if(count > 1){
                System.out.print("?");
                return;
            }
        }

        System.out.print((char) (idx + (int) 'A'));
    }
}