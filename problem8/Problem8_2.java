package problem8;

public class Problem8_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                // for (int l = 1; l <= 100; l++) {
                // if (i * i + j * j == l * l) {
                // if (i < j) {
                // System.out.println("a =" + i + " b=" + j + " c=" + l);
                // count++;
                // }
                // }
                // }
                int a_numVal = i * i;
                int b_numVal = j * j;
                int calcVal = a_numVal + b_numVal;
                for (int k = 1; k <= 100; k++) {
                    int c_numVal = k * k;
                    if (calcVal == c_numVal && i < j) {
                        System.out.println("a =" + i + " b =" + j + " c =" + k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count + "個");
    }

}