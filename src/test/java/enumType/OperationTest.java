package enumType;

import org.junit.Test;

public class OperationTest {

    @Test
    public void test1() {
        double x = 3;
        double y = 9;
        for(Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

}