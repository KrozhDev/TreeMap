import java.util.Comparator;

public class PersonsNameNobleComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        boolean surnameLonger = p1.getSurname().length() > p2.getSurname().length();
        if (surnameLonger) {
            return 1;
        } else {
            if (!surnameLonger) {
                return -1;
            } else {
                boolean older = p1.getAge() > p2.getAge();
                if (older) {
                    return 1;
                } else {
                    if (!older) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
