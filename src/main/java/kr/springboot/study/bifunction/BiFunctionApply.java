package kr.springboot.study.bifunction;

import java.util.function.BiFunction;

public class BiFunctionApply {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (n1, n2) -> n1 * n2;

        System.out.println(biFunction.apply(20, 50));
        System.out.println(biFunction.apply(10, 20));
        System.out.println(biFunction.apply(2, 5));

    }

}
