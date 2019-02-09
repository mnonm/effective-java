package generic.method;

import org.junit.Test;

import java.util.function.UnaryOperator;

public class GenericSingletonTest {

    @Test
    public void test1() {
        String[] strings = {"삼베", "대마", "나일론"};
        UnaryOperator<String> sameString =  GenericSingleton.identityFunction();
        for(String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = GenericSingleton.identityFunction();
        for(Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }

}