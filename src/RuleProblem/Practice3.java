/*
문제
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 X(1≤X≤10,000,000)가 주어진다.

출력
첫째 줄에 분수를 출력한다.
*/
package RuleProblem;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int goon = (int)(1+ Math.sqrt(8*X -7))/2;
        int spot = X - (goon*(goon-1))/2;
        if(goon%2 == 0){
            //짝수 군일때는 우측상단에서 좌측하단으로 진행
            System.out.println(spot + "/" + (goon + 1 - spot));
        }
        else{
            //홀수 군일때는 좌측하단에서 우측상단으로 진행
            System.out.println((goon + 1 - spot) + "/" + spot);
        }
    }
}
