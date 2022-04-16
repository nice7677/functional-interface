package kr.springboot.study.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAndThen {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer1 = (s, s2) -> System.out.printf("s is %s, s2 is %s", s, s2);
        BiConsumer<String, String> biConsumer2 = (s, s2) -> System.out.printf("s2 is %s, s is %s", s2, s);

        biConsumer1.andThen(biConsumer2).accept("안녕", "반가워");

        // result
        // s is 안녕, s2 is 반가워s2 is 반가워, s is 안녕

    }

}
