package by.itacademy.sukhadolskaya;

import java.util.function.Predicate;

public class RunMyInterface {
    public static void main(String[] args)
            throws Exception {
        MyPredicate myPredicate = x -> x > 0;
        System.out.println(myPredicate.check(10));   //true

        //Аналогично, но используется встроенный функциональный интерфейс java.util.function.Predicate
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(-10));

        predicate =x -> x == 0;
        System.out.println(predicate.test(0));
    }
}


