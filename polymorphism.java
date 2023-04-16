class poly {
 
    static int Multiply(int a, int b)
    {
 
        return a * b;
    }
 
    static double Multiply(double a, double b)
    {
 
        return a * b;
    }
};
 
class polymorphism {
 
    public static void main(String[] args)
    {
 
        System.out.println(poly.Multiply(2, 4));
        System.out.println(poly.Multiply(5.5, 6.3));
    }
}
