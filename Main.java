public class Main {
    public static void main(String[] args) {
        // simply initialize the double-type variable.
        double number1 = 1.12325;
        System.out.println(number1); // output is 1.12325

        /*float number2 = 1.12325;
               Using this normal way we can see the error.*/

        // specific way to initialize the float-type variable.
        float number2 = 1.12325F; // should include the 'F' or 'f' before semicolon
        System.out.println(number2); // output is 1.12325

    }
}
