package 투포인터;

import java.io.*;
import java.util.*;

public class 주몽의_명령_BOJ_1940 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 변수 선언
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        int start_index=0;
        int end_index=n-1;

        while (start_index<end_index){
            if (arr[start_index]+arr[end_index]<m){
                start_index++;
            } else if (arr[start_index]+arr[end_index]>m) {
                end_index--;
            }else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
