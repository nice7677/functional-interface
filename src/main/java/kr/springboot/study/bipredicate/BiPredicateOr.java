package kr.springboot.study.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateOr {

    public static void main(String[] args) {

        /**
         * or()는 and()처럼 BiPredicate들을 연결하는 메소드입니다.
         * 하지만 or()는 BiPredicate들의 OR 연산에 대한 결과를 리턴합니다.
         */
        BiPredicate<Integer, Integer> biPredicate1 = (n1, n2) -> n1 > n2;
        BiPredicate<Integer, Integer> biPredicate2 = (n1, n2) -> n1 * n2 > 50;

        boolean result = biPredicate1.or(biPredicate2).test(10, 9);
        System.out.println(result);

        result = biPredicate1.or(biPredicate2).test(9, 10);
        System.out.println(result);
        /**
         * result
         * true
         * true
         */

    }

}
