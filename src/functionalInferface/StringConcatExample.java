package functionalInferface;

public class StringConcatExample {
    public static void main(String args[]) {
        StringConcat stringConcat = (s1, s2) -> s2 + s1;
        System.out.println(stringConcat.concatstr("sww", "wew"));
    }
}
