package 배열;

import java.io.*;

public class 숫자의_합_구하기_BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String sNum = br.readLine();

        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum+= cNum[i] -'0';
        }

        System.out.println(sum);

    }
}
