import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya","Vasichckin", 8));
        people.add(new Person("Tanya", "Ogurtsova", 15));
        people.add(new Person("Olya", "Kry" ,16));
        people.add(new Person("Anya", "Rya", 15));
        people.add(new Person("Anya", "Ordzhonikidze", 5));
        people.add(new Person("Juan", "Clod Van Dam De France", 3));
        people.add(new Person("Borh", "Tri Galki", 59));
        people.add(new Person("Antonio", "Los Zapatos Para Mis Ninos", 2));





        System.out.println();
        System.out.println("По порядку добавления:");
        System.out.println(people);
        System.out.println();

        System.out.println("Сравнение по методу в классе:");
        sort(people);
        System.out.println(people);
        System.out.println();

        System.out.println("Сравнение по знатности:");
        sort(people, new PersonsNameNobleComparator(2));




        System.out.println(people);



    }
}
