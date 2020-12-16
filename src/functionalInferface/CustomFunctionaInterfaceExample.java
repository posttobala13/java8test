package functionalInferface;

import functionalInferface.CustomFunctionaInterface;

class CustomFunctionaInterfaceExample {

    public static void main(String args[]) {
        CustomFunctionaInterface customFunctionaInterface = () -> sayHello();
        System.out.println(customFunctionaInterface.sayHello());
    }


    private static String sayHello() {
        return "Hello Good Morning";
    }



}
