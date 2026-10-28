package 투포인터;

import java.util.*;
import java.io.*;

public class 좋은_수_구하기_BOJ_1253 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        long arr[] = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]=Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        for (int k = 0; k < n; k++) {
            long find = arr[k];
            int i = 0;
            int j = n-1;
            while (i<j){
                if(arr[i]+arr[j]==find) {
                    if(i != k && j != k){
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
