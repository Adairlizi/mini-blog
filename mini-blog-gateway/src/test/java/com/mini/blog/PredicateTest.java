package com.mini.blog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/4/5 11:04
 */

public class PredicateTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan", "lisi");

        Predicate<String> predicate = s -> s.length()>5;
        Predicate<String> predicate1 = s -> s.endsWith("si");
        list.stream().filter(predicate).forEach(System.out::println);

    }
}
