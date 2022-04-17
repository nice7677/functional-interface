package kr.springboot.study.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateNegate {

    public static void main(String[] args) {

        /**
         * negate()는 BiPredicate가 리턴하는 값과 반대되는 값을 리턴하는 Predicate를 리턴합니다.
         * 논리연산자의 NOT이 BiPredicate 앞에 붙는다고 생각할 수 있습니다.
         * 논리적으로 반대되는 BiPredicate를 만들 때 사용할 수 있습니다.
         */
        BiPredicate<Integer, Integer> biPredicate1 = (n1, n2) -> n1 > n2;
        BiPredicate<Integer, Integer> biPredicate2 = biPredicate1.negate();

        boolean result = biPredicate1.test(10, 9);
        System.out.println(result);

        result = biPredicate2.test(10, 9);
        System.out.println(result);
        /**
         * result
         * true
         * false
         */

    }

}
