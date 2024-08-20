package hj.codingTest.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : hj.codingTest.day01
 * fileName       : CoTe03
 * author         : lhj
 * date           : 2024-08-20
 * description    : 백준 11659
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-20        lhj             최초 생성
 */
public class CoTe03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //개수가 많으므로 버퍼드 사용
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] arrS = new long[suNo + 1];

        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=suNo; i++){
            arrS[i] = arrS[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int q=1; q<=quizNo; q++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(arrS[j] - arrS[i-1]);
        }
    }
}
