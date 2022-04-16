package kr.springboot.study.consumer;

import java.util.function.Consumer;

public class ConsumerParameterExample {

    public static void main(String[] args) {
        Consumer<Integer> consumer = s -> plusOne(s);
        parameterExample(consumer);

    }

    public static void parameterExample(Consumer<Integer> consumer) {
        consumer.accept(1);
    }

    public static int plusOne(int a) {
        int result = a + 1;
        System.out.println(result);
        return result;
    }

}
