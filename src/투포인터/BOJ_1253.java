package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        // 배열에 값 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 결과값 담을 변수 선언
        int count = 0;

        /// 배열의 0번 부터 마지막까지 해당 값이 좋은 수 인지 반복하며 탐색
        for (int i = 0; i < n; i++) {

            long finder = arr[i];
            int start_index = 0;
            int end_index = n-1;

            while (start_index<end_index){

                if (arr[start_index] + arr[end_index] == finder) {
                    if (start_index != finder && end_index != finder) {
                        count++;
                        break;
                    } else if (start_index == finder) {
                        start_index++;
                    } else if (end_index == finder) {
                        end_index --;
                    }

                } else if (arr[start_index] + arr[end_index] < finder) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
