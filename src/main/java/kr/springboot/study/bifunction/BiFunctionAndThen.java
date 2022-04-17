package kr.springboot.study.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThen {

    public static void main(String[] args) {

        /**
         * andThen()
         * 다음 예제는 andThen()이 어떻게 동작하는지 알려줍니다.
         * apply()의 인자들은 biFunction 에 먼저 전달되며,
         * biFunction 의 결과가 function 의 인자로 전달됩니다.
         * 그리고 function 의 결과가 리턴됩니다.
         */

        BiFunction<String, String , Integer> biFunction = (s, s2) -> s.length() + s2.length();
        Function<Integer,Integer> function = integer -> integer * integer;

        System.out.println(biFunction.andThen(function).apply("Hello", "World"));

        // result 100

    }

}
