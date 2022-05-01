package com.optional.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "test Msg";
    }

    public static void main(String[] args) {

        SupplierDemo demo = new SupplierDemo();
        System.out.println(  demo.get());

        //using lambda expressionx

        Supplier<String> msg = () -> { return "this is test msg !!"; };
        System.out.println(msg.get());


//        List<String> str = Arrays.asList();
        List<String> str = Arrays.asList("aa", "bb");
        Supplier<String> msg1 = () -> { return "this is default value !!"; };
        System.out.println(str.stream().findAny().orElseGet(msg1));

    }
}
