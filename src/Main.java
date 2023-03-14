import java.util.*;

import static java.util.Collections.max;
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

        Comparator<Person> comparator  = (Person p1, Person p2) -> {
            if (p1.getSurname().length() == p2.getSurname().length() |
                    isItWorthToCompareAges(2, howManyWords(p1.surname), howManyWords(p2.surname)))  {
                return p1.getAge() - p2.getAge();
            } else {
                return p1.getSurname().length() - p2.getSurname().length();
            }
        };

        sort(people, comparator);

        System.out.println(people);

    }
    public static int howManyWords(String str) {
        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') counter++;
        }
        return counter;
    }

    public static boolean isItWorthToCompareAges(int maxWords, int surnameWords1, int surnameWords2) {
        return (surnameWords1 >= maxWords & surnameWords2 >= maxWords);
    }
}
