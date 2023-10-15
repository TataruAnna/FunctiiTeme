package ex4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4 {
    public static void main(String[] args) {
        List<String> topNames2015  = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> sortedNames = topNames2015.stream()
                .sorted()
                .map( name-> {
                    char firstChar = Character.toUpperCase(name.charAt(0));
                    String result = (firstChar+name.substring(1)).toString();
                    return result;

                })
                        .collect(Collectors.toList());

        System.out.println(sortedNames);



        Long namesWithFirstLetterUpperCase = topNames2015.stream()
                .filter(name-> Character.isUpperCase(name.charAt(0)))
                .count();
        System.out.println(namesWithFirstLetterUpperCase);

    }
}
