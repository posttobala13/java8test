package functionalInferface;

public class IncrementByFiveExample {
    public static void main(String args[]) {
        IncrementByFiveInterface incrementByFiveInterface = IncrementByFiveExample::increaseByFive;
        System.out.println(incrementByFiveInterface.incrementByFive(5));
    }

    private static int increaseByFive(int i) {
     return i + 5;
    }
}
