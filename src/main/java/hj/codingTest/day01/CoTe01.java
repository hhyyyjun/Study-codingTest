package hj.codingTest.day01;

import java.util.Scanner;

/**
 * packageName    : hj.codingTest.day01
 * fileName       : SiganBokjapdo
 * author         : lhj
 * date           : 2024-08-20
 * description    : 백준 11720
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-20        lhj             최초 생성
 */

//숫자의 합 구하기
public class CoTe01 {
    public static void main(String[] args) {
        System.out.println("N개의 공백없는 숫자 합 구하기");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String scNum = sc.next();
        char[] scChar = scNum.toCharArray();
        System.out.println(scChar);
        int sum = 0;

        for(int i=0; i<scChar.length; i++){
            sum += scChar[i] - '0'; // -'0' 을 하는 이유는 배열의 각 자릿값을 정수형으로 변환하기 위함
        }
        System.out.println(sum);
    }
}
