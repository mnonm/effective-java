package stream;

import org.junit.Test;

public class AnagramsStreamTest {

    @Test
    public void process() {
        try {
            AnagramsStream anagramsStream = new AnagramsStream();
            anagramsStream.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}