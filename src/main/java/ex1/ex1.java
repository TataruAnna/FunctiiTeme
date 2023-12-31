package ex1;

import java.util.function.Function;

public class ex1 {
    public static void main(String[] args) {


//        everySecondChar3(s->{
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//
//                }
//            }
//            return returnVal.toString();
//
//        });

        Function<String, String> function1 = (s-> {  //aici definesc functia
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));

                }
            }
            return returnVal.toString();
        });
        System.out.println(function1.apply("1234567890")); //aici apelez functia

        everySecondChar3(function1,"1234567890"); //aici apelez functia cu parametrii

    }

    //1. Rescrie urmatoarea metoda ca o expresie lambda:
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static void everySecondChar3(Function<String, String> function,String source ){
             System.out.println(function.apply(source));
    }



    //Apoi rescrie functia clasica ca o functie lambda.
    //
    //Apoi executa acea functie lambda si paseaza-i ca parametru: "1234567890".
    //Apoi creeaza o noua functie clasica numita everySecondCharacter() care accepta ca si parametru o functie lambda si un alt String.
    // Executa functia lamba in cadrul metodei everySecondCharacter(),
    // si apeleaza everySecondCharacter() pasandu-i functia lambda creata ca prim parametru si string-ul "1234567890" ca al doilea parametru.

}
