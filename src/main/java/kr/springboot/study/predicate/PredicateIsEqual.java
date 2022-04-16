package kr.springboot.study.predicate;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PredicateIsEqual {

    public static void main(String[] args) {

        // isEqual()은 Stream에서 사용될 수도 있으며, 인자로 전달된 객체와 같은지 확인합니다.
        Stream<Integer> stream = IntStream.range(1, 10).boxed();

        stream.filter(Predicate.isEqual(5))
                .forEach(System.out::println);
        // result is 5

    }

}
