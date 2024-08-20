package hj.codingTest.day01;

import java.util.Scanner;

/**
 * packageName    : hj.codingTest.day01
 * fileName       : CoTe02
 * author         : lhj
 * date           : 2024-08-20
 * description    : 백준 1546
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-20        lhj             최초 생성
 */

//평균 구하기
public class CoTe02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        long max = 0;

        for(int i = 0; i<N; i++){
            int temp = sc.nextInt();
            if(temp > max){
                max = temp;
            }
            sum = sum + temp;
        }
        System.out.println("average : " + sum * 100.0 / max / N);
    }
}
