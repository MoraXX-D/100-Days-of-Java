//Swapping 2 number with the help of a third variable

import java.util.Scanner;

public class swap {
int a, b;
    swap(int a,int b){
        this.a = a ;
        this.b =b;
    }
    public void swapingNumber(){
        int temp = a;
        a = b;
        b = temp;
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
