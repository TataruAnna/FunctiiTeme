package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ex6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,5,4,8,12,2,55);

        //prima varianta
        Integer sum = numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.summingInt(number->number));
        System.out.println(sum);

        //a doua varianta
        Optional<Integer> sum2 = numbers.stream()
                .filter(number->number%2==0)
                .reduce((tempSum,number)->tempSum+number);

        System.out.println(sum2.get());

        System.out.println(sumOfEvenNumbers(numbers));

    }
    public static List<Integer> allEvenNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number:numbers ){
            if((number%2)==0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
    public static Integer sumOfEvenNumbers(List<Integer> numbers){
        List<Integer> sortedNumbers = allEvenNumbers(numbers);
       Integer sum = 0;
        for(Integer number: sortedNumbers){
                sum+=number;

        }
        return sum;
    }

}
