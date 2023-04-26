package problem8;

public class Problem8_4 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 1000) + 1;
        System.out.println(num);
        // int keepNumber = num;
        // int count = 0;
        // System.out.println(keepNumber);
        // while (true) {
        // count++;
        // num /= 10;
        // if (num <= 1) {
        // break;
        // }
        // }
        // System.out.println(keepNumber + "は" + count + "桁");

        int valLen = String.valueOf(num).length();
        System.out.println(num + "は" + valLen + "桁");
    }
}
