package kr.springboot.study.predicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {


        // test()에 인자를 전달하면 boolean이 리턴됩니다.
        Predicate<String> predicate = string -> string.toLowerCase().charAt(0) == 's';

        System.out.println(predicate.test("Srikar"));   // true
        System.out.println(predicate.test("Rahul"));    // false
        System.out.println(predicate.test("John"));     // false
        System.out.println(predicate.test("Ray"));      // false
        System.out.println(predicate.test("Solomon"));  // true

    }

}
