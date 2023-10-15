package ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex10 {
    //Input: String text = “acesta etse nu text”
    //      List<String> badWords = [“etse”, “nu”, “acetsa”, “extt”]
    //Output: [“etse”, “nu”], pentru ca acestea sunt cuvintele din badWords care se regasesc in text
    public static void main(String[] args) {
        String text = "acesta etse nu text";
        List<String> badWords = List.of("etse", "nu", "acetsa", "extt");
        System.out.println(findBadWords(text, badWords));

        String[] textWords = text.split(" ");
        List<String> foundBadWords = Arrays.stream(textWords)        //apeleaza metoda clasica de pe array
                .filter(word -> badWords.contains(word))
                .collect(Collectors.toList());

        System.out.println(foundBadWords);


    }
    public static List<String> findBadWords(String text, List<String> badWords){

        List<String> foundBadWords =new ArrayList<>();
        String[] textWords = text.split(" ");
        for(String word: textWords){
            if(badWords.contains(word)){
                foundBadWords.add(word);
            }
        }
        return  foundBadWords;
    }
}
