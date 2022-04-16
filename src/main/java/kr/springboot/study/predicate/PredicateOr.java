package kr.springboot.study.predicate;

import java.util.function.Predicate;

public class PredicateOr {

    public static void main(String[] args) {

        /**
         * or()는 and()처럼 Predicate들을 연결하는 메소드입니다.
         * 하지만 or()는 Predicate들의 OR 연산에 대한 결과를 리턴합니다.
         */
        Predicate<Integer> predicate1 = (num) -> num > 10;
        Predicate<Integer> predicate2 = (num) -> num < 0;

        boolean result = predicate1.or(predicate2).test(5);
        System.out.println("5 : num < 0 or num > 10 ? " + result);

        result = predicate1.or(predicate2).test(15);
        System.out.println("15 : num < 0 or num > 10 ? " + result);

        result = predicate1.or(predicate2).test(-5);
        System.out.println("-5 : num < 0 or num > 10 ? " + result);

        /**
         * result
         * 5 : num < 0 or num > 10 ? false
         * 15 : num < 0 or num > 10 ? true
         * -5 : num < 0 or num > 10 ? true
         */

    }

}
