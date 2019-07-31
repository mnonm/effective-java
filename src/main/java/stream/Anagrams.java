package stream;

import java.io.File;
import java.util.*;

public class Anagrams {
    File dictionary = new File("test.txt");
    int minGroupSize = 2;

    Map<String, Set<String>> groups = new HashMap<>();

    public void process() throws Exception {
        try(Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>())
                        .add(word);
            }
        }

        for(Set<String> group : groups.values()) {
            if(group.size() >= minGroupSize) {
                System.out.println(group.size() + ": " + group);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
