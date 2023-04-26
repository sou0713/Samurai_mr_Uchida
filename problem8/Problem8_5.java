package problem8;

public class Problem8_5 {
    public static void main(String[] args) {
        final char CHAR_DATA = '3';

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            // String s = String.valueOf(i);
            // for (int j = 0; j < s.length(); j++) {
            // char c = s.charAt(j);
            // if (c == '3') {
            // int l = Integer.parseInt(s);
            // if (l % 3 != 0) {
            // System.out.print(s + " ");
            // }
            // }
            // }
            int i_len = String.valueOf(i).length();
            for (int j = 0; j < i_len; j++) {
                char c = String.valueOf(i).charAt(j);
                if (c == CHAR_DATA && i % 3 != 0) {
                    System.out.print(i + " ");
                }
            }

        }
        System.out.println();
    }

}
