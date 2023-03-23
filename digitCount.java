import java.util.*;

public class digitCount {
    public int iterative(long  n){
        if(n == 0)
            return 1;
        int count = 0;
        while(n != 0){
            n = n/10;
            ++count;
        }
        return count;
    }

    //-----------------------------------------------------------------------------------------------------------------------//

    public int recursively(long n){
        if(n/10 ==0 )
            return 1;
        return 1 + recursively(n/10);
    }

    //-----------------------------------------------------------------------------------------------------------------------//

    public long mathFunction(long  n){
        long len = (long)(Math.log10(n) + 1); 
        return len ;
    }

    //-----------------------------------------------------------------------------------------------------------------------//

    public int usingString(int n){
        String num = Integer.toString(n);
        int size = num.length();
        return size;
    }

    //-----------------------------------------------------------------------------------------------------------------------//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no = ");
        long n = sc.nextInt();
        digitCount obj1 = new digitCount();
        System.out.println("Using Iterative method nubmer of digit is " + obj1.iterative(n));
        System.out.println("Using Recursive method nubmer of digit is " + obj1.recursively(n));
        System.out.println("Using Math library nubmer of digit is " + obj1.mathFunction(n));
        System.out.println("Using String methods nubmer of digit is " + obj1.usingString((int)n));
    
        sc.close();

    }
}
