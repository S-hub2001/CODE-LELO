public class trycatch {
    public static void main(String[] args) {
        int a=1000;
        int b=0;
        
        try {
            int c=a/b;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.println("cann't print c " + e);
            
            
        }
    }
}