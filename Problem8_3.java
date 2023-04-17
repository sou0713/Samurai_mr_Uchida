package problem8;

public class Problem8_3 {
    public static void main(String[] args) {
        System.out.println(kaijou(30));

    }

    static int kaijou(int n){
        if(n > 0){
           return n * kaijou(n-1); 
        }
        return 1;
        
    }
    
}
