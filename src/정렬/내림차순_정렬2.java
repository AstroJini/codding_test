package 정렬;

import java.util.*;

/// 먼저 모든 데이터를 음수로 바꾼 뒤에 Arrays.sort()로 정렬하고 다시 부호를 되돌려 놓는 방식이다


public class 내림차순_정렬2 {
    public static void main(String[] args){
        int[] A = {5, 3, 2, 4, 1};
        negate(A);
        Arrays.sort(A);
        negate(A);
        System.out.println(Arrays.toString(A));
    }

    static void negate(int[] temp){
        for(int i=0; i<temp.length; i++){
            temp[i]*=-1;
        }
    }
}
