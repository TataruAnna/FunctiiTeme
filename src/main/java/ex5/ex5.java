package ex5;

import ex2.Person;

import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 23));
        persons.add(new Person("Ana", 60));
        persons.add(new Person("Mihai", 65));

        persons.stream()
                .filter(person -> person.getAge()>18)
                .forEach(person-> System.out.println(person));
    }

}
