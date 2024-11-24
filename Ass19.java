package Assignments;
public class Ass19 {
    double width, height, depth;
    int Ass19No;
 
    
    Ass19(double w, double h, double d, int num)
    {
        width = w;
        height = h;
        depth = d;
        Ass19No = num;
    }
 
    
    Ass19()
    {
       
        width = height = depth = 0;
    }
 
   
    Ass19(int num)
    {
        
        this();
 
        Ass19No = num;
    }
 
    public static void main(String[] args)
    {
        
        Ass19 a = new Ass19(1);
 
       
        System.out.println(a.width);
    }
}

