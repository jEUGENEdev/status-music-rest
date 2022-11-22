package com.jeugenedev.status_music.utils;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class StringGenerator {
    private final Random random = new Random();

    public String generateUPPERString(int len) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < len; i++) {
            string.append((char) (random.nextInt(26) + 65));
        }
        return string.toString();
    }

    public String generateLatinString(int len) {
        StringBuilder string = new StringBuilder();
        record Range(int start, int end) {}
        List<Range> sequences = List.of(new Range(65, 90), new Range(97, 122), new Range(48, 57));
        while(len-- > 0) {
            Range range = sequences.get(random.nextInt(sequences.size()));
            string.append((char) (random.nextInt(range.end - range.start + 1) + range.start));
        }
        return string.toString();
    }
}
