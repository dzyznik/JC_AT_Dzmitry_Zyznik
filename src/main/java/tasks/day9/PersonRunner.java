package main.java.tasks.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

//        list.stream().sorted((p,p1) -> {if (p.sex != p1.sex){return p1.sex.compareTo(p1.sex);} return p.age - p1.age;}).peek(p -> System.out.println(p.name)).collect(Collectors.toList());
//        System.out.println(list.stream().min(Comparator.comparingInt(p->p.age)).get().name);
//        System.out.println(list.stream().collect(Collectors.toMap(p -> p.hashCode(),p-> p)));
        list.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
//        System.out.println(list.stream().filter(x -> x.sex == Person.Sex.WOMEN && x.age >= 18 && x.age <= 55 || x.sex == Person.Sex.MAN && x.age >= 18 && x.age <= 60).count());
//        List<Person> newList = new ArrayList<>();
//        for (Person person : list) {
//            if (person.sex == Person.Sex.WOMEN) {
//                if (person.age >= 18 && person.age <= 55) {
//                    newList.add(person);
//                }
//            }
//            if (person.sex == Person.Sex.MAN) {
//                if (person.age >= 18 && person.age <= 60) {
//                    newList.add(person);
//                }
//            }
//        }
//
//        System.out.println(newList.size());

    }
}
