import java.lang.*;

class Funoverload { 

    // Overloaded sum(). This sum takes two int parameters 
    public int funoverload(int x, int y) 
    { 
        return (x + y); 
    } 

    // Overloaded sum(). This sum takes three int parameters 
    public int funoverload(int x, int y, int z) 
    {
        return (x + y + z); 
    } 

    // Overloaded sum(). This sum takes two double parameters 
    public double funoverload(double x, double y) 
    { 
        return (x + y); 
    } 

    // Driver code 
    public static void main(String args[]) 
    { 
        Funoverload s = new Funoverload(); 
        System.out.println(s.funoverload(10, 20)); 
        System.out.println(s.funoverload(10, 20, 30)); 
        System.out.println(s.funoverload(10.5, 20.5)); 
    } 
} 
