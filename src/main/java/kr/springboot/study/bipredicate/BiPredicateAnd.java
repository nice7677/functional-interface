package kr.springboot.study.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateAnd {

    public static void main(String[] args) {

        /**
         * and()는 BiPredicate들을 연결하는(Chain) 메소드입니다.
         * BiPredicate들의 결과들을 AND 연산하고 그 결과를 리턴합니다.
         */
        BiPredicate<Integer, Integer> biPredicate1 = (n1, n2) -> n1 > n2;
        BiPredicate<Integer, Integer> biPredicate2 = (n1, n2) -> n1 * n2 > 150;

        boolean result = biPredicate1.and(biPredicate2).test(11, 10);

        System.out.println(result);
        // result false

    }

}
