package kr.springboot.study.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionApply {

    public static void main(String[] args) {

        Function<String, String> function = s -> s.replaceAll(" ", "......");

        Consumer<String> consumer = System.out::println;

        consumer.accept(function.apply("h e l l o"));

    }

}
