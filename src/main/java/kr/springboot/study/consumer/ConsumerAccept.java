package kr.springboot.study.consumer;

import java.util.function.Consumer;

public class ConsumerAccept {

    public static void main(String[] args) {

        /**
         *
         */

        Consumer<String> consumer = System.out::println;
        consumer.accept("안녕");
        consumer.accept("공부하자");
        /**
         * 안녕
         * 공부하자
         */


    }

}
