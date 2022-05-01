package com.optional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        if(t%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(10));


        Predicate<Integer> even = t -> t%2 == 0 ;

        System.out.println(even.test(9));
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        nums.stream().filter(even).forEach(t-> System.out.println("Even::"+ t));

    }
}
