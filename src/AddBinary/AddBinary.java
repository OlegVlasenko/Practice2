package AddBinary;

import java.util.Arrays;

class AddBinary {
    final int BASE_SYSTEM = 2;

    String add(String a, String b) {
        StringBuilder res = new StringBuilder();

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
            resAdd = a1[i] - '0' + b1[i] - '0' + rest;

            nextDigit = String.valueOf(resAdd % BASE_SYSTEM).charAt(0);

            res.insert(0, nextDigit);
            rest = resAdd / BASE_SYSTEM;
        }

        if (rest > 0) res.insert(0, rest);


        return res.toString();
    }
}
