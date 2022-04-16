package kr.springboot.study.consumer;

import java.util.function.Consumer;

public class ConsumerAndThen {

    public static void main(String[] args) {

        /**
         * andThen 은 chaining 느낌
         */

        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = s -> System.out.printf("this is second consumer!!! second value is %s", s);

        consumer1.andThen(consumer2).accept("!!!!study.springboot.kr!!!!");

        /**
         * !!!!study.springboot.kr!!!!
         * this is second consumer!!! second value is !!!!study.springboot.kr!!!!
         */

    }

}
