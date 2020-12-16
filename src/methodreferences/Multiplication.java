package methodreferences;

import java.util.Comparator;
import java.util.function.BiFunction;

public class Multiplication {

    public static int addFunction(int a, int b) {
        return a+b;
    }



    public static void main(String args[]) {
        BiFunction<Integer, Integer, Integer> add = Multiplication::addFunction;
        add.apply(4,6);
        System.out.println(add.apply(4,6));
    }
}
