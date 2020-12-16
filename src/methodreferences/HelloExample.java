package methodreferences;

public class HelloExample {
    public static void main(String str[]) {
         HelloInterface helloInterface =  Hello::new;
        helloInterface.display("Bala");
    }
}
