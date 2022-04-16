package kr.springboot.study.predicate;

import java.util.function.Predicate;

public class PredicateNegate {

    public static void main(String[] args) {

        /**
         * negate()는 Predicate가 리턴하는 값과 반대되는 값을 리턴하는 Predicate를 리턴합니다.
         * 논리연산자의 NOT이 Predicate 앞에 붙는다고 생각할 수 있습니다.
         * 논리적으로 반대되는 Predicate를 만들 때 사용할 수 있습니다.
         * !!!!!!! <-
         */
        Predicate<Integer> predicate = (num) -> num > 10;
        Predicate<Integer> negatePredicate = predicate.negate();

        boolean result = predicate.test(100);
        System.out.println("100 is greater than 10 ? " + result);

        result = negatePredicate.test(100);
        System.out.println("100 is less than 10 ? " + result);

        /**
         * result
         * 100 is greater than 10 ? true
         * 100 is less than 10 ? false
         */

    }

}
