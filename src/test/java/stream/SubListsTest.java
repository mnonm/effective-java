package stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SubListsTest {

    private List<Character> list;

    @Before
    public void setUp() {
        list = Arrays.asList('a','b','c');
    }

    @Test
    public void prefixesTest() {
        assertStreamEquals(SubLists.prefixes(list), Stream.of(Arrays.asList('a'), Arrays.asList('a', 'b'),
                Arrays.asList('a', 'b', 'c')));
}

    @Test
    public void suffixesTest() {
        assertStreamEquals(SubLists.suffixes(list), Stream.of(Arrays.asList('a', 'b', 'c'), Arrays.asList('b', 'c'),
                Arrays.asList('c')));
    }

    @Test
    public void ofTest() {
        assertStreamEquals(SubLists.of(list), Stream.of(Arrays.asList(), Arrays.asList('a'), Arrays.asList('a', 'b'),
                Arrays.asList('b'),
                Arrays.asList('a', 'b', 'c'),
                Arrays.asList('b', 'c'),
                Arrays.asList('c')
                ));
    }

    static void assertStreamEquals(Stream<?> s1, Stream<?> s2)
    {
        Iterator<?> iter1 = s1.iterator(), iter2 = s2.iterator();
        while(iter1.hasNext() && iter2.hasNext())
            assertEquals(iter1.next(), iter2.next());
        assert !iter1.hasNext() && !iter2.hasNext();
    }

}