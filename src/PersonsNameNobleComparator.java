import java.util.Comparator;

public class PersonsNameNobleComparator implements Comparator<Person> {

    private int maxWords;

    public PersonsNameNobleComparator(int maxWords) {
        this.maxWords = maxWords;
    }


    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getSurname().length() == p2.getSurname().length() |
                isItWorthToCompareAges(howManyWords(p1.surname), howManyWords(p2.surname)))  {
            return p1.getAge() - p2.getAge();
        } else {
            return p1.getSurname().length() - p2.getSurname().length();
        }

    }

    public int howManyWords(String str) {
        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') counter++;
        }
        return counter;
    }

    public boolean isItWorthToCompareAges(int surnameWords1, int surnameWords2) {
        return (surnameWords1 >= maxWords & surnameWords2 >= maxWords);
    }
}
