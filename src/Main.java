import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya","Vasichckin", 8));
        people.add(new Person("Tanya", "Ogurtsova", 15));
        people.add(new Person("Olya", "Kry" ,15));
        people.add(new Person("Anya", "Rya", 16));
        people.add(new Person("Anya", "Ordzhonikidze", 5));




        System.out.println();
        System.out.println("По порядку добавления:");
        System.out.println(people);
        System.out.println();

        System.out.println("Сравнение по методу в классе:");
        sort(people);
        System.out.println(people);
        System.out.println();

        System.out.println("Сравнение по знатности:");
        sort(people, new PersonsNameNobleComparator());




        System.out.println(people);



    }
}
