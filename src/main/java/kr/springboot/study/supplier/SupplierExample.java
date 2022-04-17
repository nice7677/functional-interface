package kr.springboot.study.supplier;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        /**
         * Supplier로부터 객체를 리턴받을 때는 get()을 호출하면 됩니다.
         */
        Supplier<LocalDateTime> supplier = LocalDateTime::now;

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        /**
         * result
         * 2022-04-16T20:46:36.141253
         * 2022-04-16T20:46:36.141633
         * 2022-04-16T20:46:36.141672
         */

    }

}
