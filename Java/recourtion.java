public class recourtion {
    
        int fact(int x) {
    
            if (x == 0) {
    
                return 1;
            }
            return x * fact(x - 1);
    
        }
        // int p = 1;
        // for (int i = 1; i <= x; i++) {
        // p = p * i;
    
        // }
        // return p;
    
        public static void main(String[] args) {
            int i = 5;
            recourtion cvv = new recourtion();
    
            int s = cvv.fact(i);
            System.out.println(s);
        }
    
    }

