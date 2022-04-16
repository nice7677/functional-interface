package kr.springboot.study.function;

import java.util.function.Function;

public class FucntionAndThen {

    public static void main(String[] args) {

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = s -> s.substring(0, 5);

        System.out.println(function1.apply("Hello World"));
        System.out.println(function2.apply("Im Mr.lee"));

        // result
        // HELLO WORLD
        // Im Mr

        System.out.println(function1.andThen(function2).apply("Hello World"));
        System.out.println(function1.andThen(function2).apply("Im Mr.lee"));

        /**
         * result
         * HELLO
         * IM MR
         */

    }

}
