package 정렬.comparable을_활용한_다중_조건_정렬;

import java.util.*;

public class Main {
    static void main(String[] args) {
        ArrayList<Score> myarr = new ArrayList<>();

        myarr.add(new Score(80, 100));
        myarr.add(new Score(100, 50));
        myarr.add(new Score(70, 100));
        myarr.add(new Score(80, 90));

        Collections.sort(myarr);
        for (Score s : myarr) {
            System.out.println(s.toString());
        }
    }
}
