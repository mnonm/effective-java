package stream;

import org.junit.Test;

public class OperationStreamTest {

    @Test
    public void OperationStreamTest1() {
        double x = 3, y = 5;

        for(OperationStream op : OperationStream.values()) {
           System.out.println(op.apply(x, y));
        }
    }

}