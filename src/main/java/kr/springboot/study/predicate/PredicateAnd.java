package kr.springboot.study.predicate;

import java.util.function.Predicate;

public class PredicateAnd {

    public static void main(String[] args) {

        /**
         * and()는 Predicate들을 연결하는(Chain) 메소드입니다.
         * Predicate들의 결과들을 AND 연산하고 그 결과를 리턴합니다.
         * 연결해서 계산해준다.
         */

        Predicate<Integer> predicate1 = (num) -> num > 10;
        Predicate<Integer> predicate2 = (num) -> num < 20;

        boolean result = predicate1.and(predicate2).test(25);
        System.out.println("25 : 10 < num < 20 ? " + result);

        result = predicate1.and(predicate2).test(15);
        System.out.println("15: 10 < num < 20 ? " + result);

        /**
         * result
         * 25 : 10 < num < 20 ? false
         * 15: 10 < num < 20 ? true
         */

    }

}
