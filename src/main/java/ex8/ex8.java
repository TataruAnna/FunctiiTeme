package ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex8 {
    //Scrie o metoda care sa sorteze numerele dintr-o lista de Integer-uri, dar inainte de asta sa le transforme in valori pozitive
    //
    //Exemplu:
    //
    //Input: [-1,2,-3,4,-5]
    //Output:[1,2,3,4,5]
    //(HINT: map pentru a transforma fiecare numar din negativ in pozitiv, apoi sorted() ca si operatie finala.
    // Foloseste Math.abs() pentru a transforma un numar din negativ in pozitiv)
    //
    //Rezolva problema si fara expresii lambda
    //
    //Rezolva problema si fara expresii lambda. (HINT: foloseste metoda sort din arraylist)
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1,2,-3,4,-5);
        List<Integer> sortedNumbers = numbers.stream()
                .map(number->Math.abs(number))
                .sorted((number1,number2)->Integer.compare(number1,number2))
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
        List<Integer> listOfPositiveNumbers = new ArrayList<>();
        for(Integer number : numbers){
            listOfPositiveNumbers.add(Math.abs(number));
        }
        listOfPositiveNumbers.sort((number1,number2)->Integer.compare(number1,number2));
        System.out.println(listOfPositiveNumbers);
    }
}
