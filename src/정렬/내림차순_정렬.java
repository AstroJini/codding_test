package 정렬;

import java.util.*;

public class 내림차순_정렬 {
    static void main(String[] args) {
        // Collections 라이브러리를 활용하기 위해서는 배열을 Class 형식으로 선언해야한다
        Integer[] A = {5, 2, 3, 4, 1};
        Arrays.sort(A, Collections.reverseOrder());
        System.out.println(Arrays.toString(A));
    }
}
