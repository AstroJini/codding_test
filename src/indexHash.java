import java.io.*;
import java.util.*;

public class indexHash {
    static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int number = Integer.parseInt(st.nextToken());
            count[number]++;
        }
        br.close();
        for(int i=0; i<=1000; i++){
            if(count[i] != 0){
                for(int j=0; j<count[i]; j++){
                    bw.write(i + " ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
