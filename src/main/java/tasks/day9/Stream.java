package main.java.tasks.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
//        System.out.println(list.stream().anyMatch(x -> x.equals("мама")));
//        System.out.println(list.stream().allMatch(x -> x.contains("м")));
//        System.out.println(list.stream().map(x -> x.concat("м")));
//        System.out.println(Arrays.toString(list.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> s.length() > 0).toArray(String[]::new)));
//        System.out.println(list.stream().sorted().collect(Collectors.toList()));
//        System.out.println(list.stream().sorted((a, b) -> -a.compareTo(b)).distinct().collect(Collectors.toList()));

//        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get());
//        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).reduce((s,s1) -> s1+s).get().length());
//        System.out.println(list.stream().map(String::length).reduce((x,y) -> x + y).get());
//        System.out.println(list.stream().mapToInt(String::length).sum());
//        System.out.println(list.stream().map(String::length).filter(s -> s % 2 != 0).reduce((x,y) -> x + y).get());
//        System.out.println(list.stream().map(String::length).collect(Collectors.summingInt(i -> {if (i % 2 == 0){
//        return 0;} else return i;})));
        System.out.println(list.stream().collect(Collectors.joining(":","<p>","</p>")));

        }

    }
