package generic;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GenericStackTest {

    private static GenericStack<String> stack;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void setUp() {
        stack = new GenericStack<>();

    }

    @Test
    public void test1() {
        stack.push("test1");
        stack.push("test2");
        assertThat(stack.pop(), is("test2"));
        assertThat(stack.pop(), is("test1"));
    }

    @Test
    public void test2() {
        exception.expect(EmptyStackException.class);
        stack.pop();
    }

    @Test
    public void isEmpty() {
        assertThat(stack.isEmpty(), is(true));
    }
}