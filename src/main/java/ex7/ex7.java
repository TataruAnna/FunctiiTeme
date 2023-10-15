package ex7;

import java.util.List;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        //Scrie o metoda care sa calculeze suma numerelor divizibile cu x sau y
        // (unde x si y sunt primiti ca parametri), dintr-o lista de Integer-uri.
        // HINT: foloseste filter si sum sau foloseste reduce
        //
        //Rezolva problema si fara expresii lambda.

        List<Integer> numbers = List.of(1,2,3,5,4,7,12,2,55);
        System.out.println(sumOfNumbersDivisible(numbers,2,5));
        System.out.println(sumOfNumberDivisible2(numbers,2,5));

    }
    public static Integer sumOfNumbersDivisible(List<Integer> numbers, Integer x, Integer y){
        Integer sum = numbers.stream()
                .filter(number->(number%x==0)||(number%y==0))
                .collect(Collectors.summingInt(number->number));
        return sum;
    }

    public static Integer sumOfNumberDivisible2(List<Integer> numbers, Integer x, Integer y){
        Integer sum = 0;
        for(Integer number: numbers){
            if(number%x==0 || number%y==0) {
                sum += number;
            }
        }
        return sum;
    }
}
