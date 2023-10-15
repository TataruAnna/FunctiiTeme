package ex2;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 23));
        persons.add(new Person("Ana", 60));
        persons.add(new Person("Mihai", 65));

        System.out.println(persons);
        persons.sort((Person p1, Person p2)-> p1.getName().compareTo(p2.getName()));
        System.out.println(persons);

    }


}
