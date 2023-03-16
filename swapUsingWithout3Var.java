//Swapping 2 number without using 3rd var
import java.util.Scanner;

public class swapUsingWithout3Var {
    int a,b;
    swapUsingWithout3Var(int a,int b){
        b=b+a;
        this.a=b-a;
        this.b=b-a;
    }
    public void printNumbers() {
        System.out.println("After swapping: ");
        System.out.println("Num1 = " + a);
        System.out.println("Num2 = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Enter the fisrt no. ");
        a = sc.nextInt();
        System.out.print("Enter the second no. ");
        b = sc.nextInt();

        swap obj1 = new swap(a,b);
        obj1.swapingNumber();
        obj1.printNumbers();

        sc.close();
    }
}
