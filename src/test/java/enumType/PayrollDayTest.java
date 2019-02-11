package enumType;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PayrollDayTest {

    @Test
    public void test1() {
        assertThat(PayrollDay.MONDAY.pay(500, 100), is(51000));
    }

    @Test
    public void test2() {
        assertThat(PayrollDay.SUNDAY.pay(500, 100), is(75000));
    }

}