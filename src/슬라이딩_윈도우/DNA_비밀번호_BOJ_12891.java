package 슬라이딩_윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA_비밀번호_BOJ_12891 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 사용할 배열 사이즈

        String dna = br.readLine();
        char[] carr = new char[dna.length()];
        for (int i = 0; i < dna.length(); i++) {
            carr[i] = dna.charAt(i);
        }

        System.out.println(carr);

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }
}
