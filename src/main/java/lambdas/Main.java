package lambdas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //parameters, the -> arrow, and an expression.
        (String first, String second) ->
        {
            if (first.length() < second.length()) return -1;
            else if (first.length() > second.length()) return 1;
            else return 0;
        }

        //no parameters
        () -> { for (int i = 100; i >= 0; i--) System.out.println(i); }

        //inferred parameters
        Comparator<String> comp
                = (first, second) // Same as (String first, String second)
                -> first.length() - second.length();

        //single param with inferred type
        ActionListener listener = event -> System.out.println("The time is " + new Date()");

                //You never specify the result type of a lambda expression. It is always inferred from context.

                //conversion to functional interface
                Arrays.sort(words,
                        (first, second) -> first.length() - second.length());

                Timer t = new Timer(1000, event ->
                {
                    System.out.println("At the tone, the time is " + new Date());
                    Toolkit.getDefaultToolkit().beep();
                });

        Timer t = new Timer(1000, System.out::println);

        //The expression System.out::println is a method reference that is equivalent to the lambda expression x -> System.out.println(x)
        //The :: operator separates the method name from the name of an object or class
    }
}
