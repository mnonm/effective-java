package objectMethodOverride;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneNumberTest {

    private static PhoneNumber pn1, pn2;

    @BeforeClass
    public static void setUp() {
        pn1 = new PhoneNumber(123, 333, 3333);
        pn2 = new PhoneNumber(123, 333, 3333);
    }

    @Test
    public void equalsTest() {
        assertThat(pn1.equals(pn2), is(true));
    }

    @Test
    public void hashCodeTest() {
        assertThat(pn1.hashCode(), is(pn2.hashCode()));
    }

    @Test
    public void toStringTest() {
        assertThat(pn1.toString(), is("123-333-3333"));
    }
}