//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class Main {
            public static void main(String[] args) {
                //Instantiate the functional interface with a Lambda expression
                PiValue pi = () -> 3.1415;

                // Invoke method getPiValue()
                System.out.println("Pi value is: " + pi.getPiValue());
            }
        }

