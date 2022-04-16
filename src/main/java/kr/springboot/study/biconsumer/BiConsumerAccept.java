package kr.springboot.study.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAccept {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (s, s2) -> System.out.printf("s is %s, and s2 is %s", s, s2);

        biConsumer.accept("안녕", "반가워");

        // s is 안녕, and s2 is 반가워

    }

}
