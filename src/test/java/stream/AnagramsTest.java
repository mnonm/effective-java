package stream;

import org.junit.Before;
import org.junit.Test;

public class AnagramsTest {

    private Anagrams anagrams;

    @Before
    public void setUp() {
        anagrams = new Anagrams();
    }

    @Test
    public void processTest() {
        try {
            anagrams.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}