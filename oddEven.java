// to check if a number is odd or even
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        
        if(number%2 != 0)
        {
            System.out.println(number + " is a odd number");
        }
        else{
            System.out.println(number + " is a even number");
        }
        sc.close();
    }
}
