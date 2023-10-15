package ex3;

import java.util.function.Supplier;

public class ex3 {
    public static void main(String[] args) {
        Supplier<String> textSupplier = () -> "Imi place Java";
        System.out.println(textSupplier.get());

    }

}
