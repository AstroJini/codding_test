//package 정렬.이차원_ArrayList를_활용한_그래프_구현;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class Main {
//    static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer();
//        ArrayList<Edge> list[] = new ArrayList[10];
//
//        for (int i = 0; i < 10; i++) {
//            list[i] new ArrayList<Edge>();
//        }
//
//        for (int i = 0; i < list.length; i++) {
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            list[s].add(new Edge(e, v));
//        }
//    }
//}
