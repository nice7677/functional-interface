package kr.springboot.study.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static void main(String[] args) {

        //BiPredicate 객체는 Lambda로 구현할 수 있고, test()에 인자 2개를 전달하면 boolean이 리턴됩니다.
        BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> (i1 + i2) % 2 == 0;

        System.out.println(biPredicate.test(10,20));        // true
        System.out.println(biPredicate.test(25,50));        // false
        System.out.println(biPredicate.test(11,63));        // true
        System.out.println(biPredicate.test(27,26));        // false

    }

}
