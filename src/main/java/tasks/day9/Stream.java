package main.java.tasks.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().anyMatch(x -> x.equals("мама")));
        System.out.println(list.stream().allMatch(x -> x.contains("м")));
        System.out.println(list.stream().map(x -> x.concat("м")));
        System.out.println(Arrays.toString(list.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> s.length() > 0).toArray(String[]::new)));
    }
}
