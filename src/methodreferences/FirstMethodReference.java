package methodreferences;

public class FirstMethodReference {

    public static void main(String args[])  {
        FirstMethodReference firstMethodReference = new FirstMethodReference();
        //firstMethodReference.methodCall();
        MyInterface myInterface = firstMethodReference::methodCall;
        myInterface.display();
    }

    private void methodCall() {
        System.out.println("This is first method reference");
    }
}
