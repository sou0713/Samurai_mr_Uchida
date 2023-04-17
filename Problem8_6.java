package problem8;

public class Problem8_6 {
    public static void main(String[] args) {
        int bunsi1 = (int)(Math.random() * 10) + 1;
        int bunsi2 = (int)(Math.random() * 10) + 1;
        int bunbo1 = (int)(Math.random() * 9)  + 2;
        int bunbo2 = (int)(Math.random() * 9)  + 2; 

        int bunsi = bunsiKeisan(bunsi1, bunbo1, bunsi2, bunbo2);
        int bunbo = bunboKeisan(bunbo1, bunbo2);
        if (checkAn(bunsi, bunbo) == true){
            System.out.println(bunsi1 + "/" + bunbo1 + "+" + bunsi2 + "/" + bunbo2 + "=" + divNumber(bunsi, bunbo));
        } else {
            if (bunsi > bunbo){
                if (gcd(bunsi, bunbo) != 1){
                    int xBunsi = bunsi / (gcd(bunsi, bunbo));
                    int xBunbo = bunbo / (gcd(bunsi, bunbo));
                    System.out.println(bunsi1 + "/" + bunbo1 + "+" + bunsi2 + "/" + bunbo2 + "=" + (xBunsi / xBunbo) + "." + (xBunsi % xBunbo) + "/" + xBunbo );
                } else {
                    System.out.println(bunsi1 + "/" + bunbo1 + "+" + bunsi2 + "/" + bunbo2 + "=" + (bunsi / bunbo) + "." + (bunsi % bunbo) + "/" + bunbo);
                }
            } else {
                if (gcd(bunsi, bunbo) != 1){
                    int yBunsi = bunsi/ (gcd(bunsi, bunbo));
                    int yBunbo = bunbo / (gcd(bunsi, bunbo));
                    System.out.println(bunsi1 + "/" + bunbo1 + "+" + bunsi2 + "/" + bunbo2 + "=" + yBunsi + "/" + yBunbo);
                } else {
                    System.out.println(bunsi1 + "/" + bunbo1 + "+" + bunsi2 + "/" + bunbo2 + "=" + bunsi + "/" + bunbo );
                }
            }
        }
    }

    //最大公約数
    static int gcd(int n1, int n2){
        while(n1 >= 1 && n2 >= 1){
            if (n1 < n2) {
                n2 = n2 % n1;
            } else {
                n1 = n1 % n2;
            }
        }
        if (n1 >= 1){
            return n1;
        }
        return n2;
    }

    //最小公倍数
    static int lcm(int n1, int n2){
        return (n1 * n2) / (gcd(n1, n2));
    }

    static int bunsiKeisan(int bunsi1, int bunbo1, int bunsi2, int bunbo2) {
        int bunbo = lcm(bunbo1,bunbo2);
        int lBunsi = (bunbo/bunbo1) * bunsi1;
        int rBunsi = (bunbo/bunbo2) * bunsi2;
        int bunsi = lBunsi + rBunsi;
        return bunsi; 
    }

    static int bunboKeisan(int bunbo1, int bunbo2) {
        return lcm(bunbo1,bunbo2);
    }

    static boolean checkAn(int bunsi, int bunbo){
        double ans = (double)bunsi / (double)bunbo;
        if (ans == 1.0 || ans ==2.0 || ans == 3.0 || ans == 4.0 || ans == 5.0 || ans == 6.0 || ans == 7.0 || ans == 8.0 || ans == 9.0){
            return true;
        }
        return false;
    }

    static int divNumber(int bunsi, int bunbo){
        double ans =( double)bunsi / (double)bunbo;
        if (ans == 1.0){
            return 1;
        } else if (ans == 2.0){
            return 2;
        } else if (ans == 3.0){
            return 3;
        } else if (ans == 4.0) {
            return 4;
        } else if (ans == 5.0) {
            return 5;
        } else if (ans == 6.0) {
            return 6;
        } else if (ans == 7.0) {
            return 7;
        } else if (ans == 8.0) {
            return 8;
        } else if (ans == 9.0) {
            return 9;
        } 
        return 0;
        
     }
}

