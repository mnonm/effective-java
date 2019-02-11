package enumType;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OperationTest {

    @Test
    public void test1() {
        double x = 3;
        double y = 9;
        for(Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    @Test
    public void test2() {
        Operation.fromString("-").ifPresent(e -> System.out.println(e.name()));
        assertThat(        Operation.fromString("-").get(), is(Operation.MINUS));
    }

}