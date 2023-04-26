package problem8;

public class Problem8_3 {
    public static void main(String[] args) {
        int number = 30;
        System.out.println(kaijou(number));
    }

    static int kaijou(int n) {
        if (n > 0) {
            int calc = n * kaijou(n - 1);
            return calc;
        }
        return 1;
    }
}
