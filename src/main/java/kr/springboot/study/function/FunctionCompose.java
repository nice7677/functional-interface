package kr.springboot.study.function;

import java.util.function.Function;

public class FunctionCompose {

    public static void main(String[] args) {

        /**
         * compose --
         * multiply.compose(add)는 add와 multiply 함수를 합성합니다.
         * addAndMultiply.apply(1)는 1이 add 함수에 인자로 전달되며,
         * 그 결과가 multiply 함수에 전달되며 결과가 리턴됩니다.
         */

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = s -> s.substring(0, 5);

        System.out.println(function1.compose(function2).apply("Hello World"));
        System.out.println(function1.compose(function2).apply("Im Mr.lee"));

        /**
         * result
         * HELLO
         * IM MR
         */

    }

}
