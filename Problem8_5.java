package problem8;

public class Problem8_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.print(i + " "); 
            }
            String s = String.valueOf(i);
            for(int j = 0; j< s.length(); j++){
                char c = s.charAt(j);
                if (c == '3'){
                    int l = Integer.parseInt(s);
                    if(l % 3 != 0){
                       System.out.print(s + " "); 
                    }
                }
            }
        }
        System.out.println();
    }
    
}
