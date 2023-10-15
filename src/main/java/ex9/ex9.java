package ex9;

import ex2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex9 {
    //9. Filtreaza persoanele care pot vota
    //O persoana este caracterizata de nume si varsta. Scrie o metoda statica numita isPersonEligibleForVoting(),
    // care accepta ca parametru o lista de persoane si returneaza o lista cu persoanele care pot vota.
    //
    //Scrie apoi metoda si fara expresii lambda.
    public static void main(String[] args) {
        List<Person> persoList = List.of(new Person("Ionel",14), new Person("Gigel",21), new Person("Maria",24));
        System.out.println(areEligibleForVoting(persoList));
        System.out.println(areEligibleForVoting2(persoList));
    }

    public static List<Person> areEligibleForVoting (List<Person> personList){
        List<Person> eligibleForVoting = personList.stream()
                .filter(person -> person.getAge()>18)
                .collect(Collectors.toList());
        return eligibleForVoting;
    }
    public static List<Person> areEligibleForVoting2(List<Person> personList){
       List<Person> eligiblePersons = new ArrayList<>();
        for(Person person:personList){
            if(person.getAge()>18){
                eligiblePersons.add(person);
            }
        }
        return eligiblePersons;
    }
}
