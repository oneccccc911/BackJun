package StringProblem;/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.

다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 <= T <= 1,000)가 주어진다. 각 테스트 케이스는  반복 횟수 R(1 <= R <= 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
*/
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] inputArr = new String[n];

        for(int i = 0 ; i < n ; i++){
            inputArr[i] = sc.nextLine();
        }

        for(int i = 0 ; i< n ;i++){
            String[] strArr = inputArr[i].split(" ");

            int count = Integer.parseInt(strArr[0]);

            for(int j = 0 ; j < strArr[1].length() ; j++){
                for(int k = 0 ; k < count ; k++){
                    System.out.print(strArr[1].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
