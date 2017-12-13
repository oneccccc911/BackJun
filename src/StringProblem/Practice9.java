/*
문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
ñ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.

단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

문제 설명에 나와있는 크로아티아 알파벳만 주어진다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
*/
package StringProblem;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                if (i < str.length() - 1 && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
                    i += 1;
                }
            } else if (str.charAt(i) == 'd') {
                if (i < str.length() - 2 && (str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=')) {
                    i += 2;
                } else if (i < str.length() - 1 && (str.charAt(i + 1) == '-')) {
                    i += 1;
                }
            } else if (str.charAt(i) == 'l' || str.charAt(i) == 'n') {
                if (i < str.length() - 1 && (str.charAt(i + 1) == 'j')) {
                    i += 1;
                }
            } else if (str.charAt(i) == 's' || str.charAt(i) == 'z') {
                if (i < str.length() - 1 && (str.charAt(i + 1) == '=')) {
                    i += 1;
                }
            }
            count++;
        }
        sc.close();
        System.out.println(count);
    }
}
