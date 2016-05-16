package AddNumberBase36;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class AddNumberBase36 {

    private static final int BASE_SYSTEM = 36;
    private static final List<Character> VALID_CHARS = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public String add(String a, String b) {
        StringBuilder res = new StringBuilder();

        HashMap<Character, Integer> validCharsAndTheirIndexes = new HashMap<>();
        for (Character symbol : VALID_CHARS) validCharsAndTheirIndexes.put(symbol, VALID_CHARS.indexOf(symbol));


        Integer MaxSize = Math.max(a.length(), b.length());
        char[] a1 = new char[MaxSize];
        char[] b1 = new char[MaxSize];

        Arrays.fill(a1, '0');
        Arrays.fill(b1, '0');

        int pos = MaxSize - a.length();
        for (char sym : a.toLowerCase().toCharArray()) {
            a1[pos++] = sym;
        }

        pos = MaxSize - b.length();
        for (char sym : b.toLowerCase().toCharArray()) {
            b1[pos++] = sym;
        }

        Integer resAdd, rest = 0;
        Character nextDigit;

        for (int i = MaxSize - 1; i >= 0; i--) {
            resAdd = validCharsAndTheirIndexes.get(a1[i]) + validCharsAndTheirIndexes.get(b1[i]) + rest;

            nextDigit = VALID_CHARS.get(resAdd % BASE_SYSTEM);

            res.insert(0, nextDigit);
            rest = resAdd / BASE_SYSTEM;
        }

        if (rest > 0) res.insert(0, VALID_CHARS.get(rest));

        return res.toString();
    }
}
