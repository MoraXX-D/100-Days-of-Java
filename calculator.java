import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println("Enter Your 1st and 2nd no--> ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Now chose 1 for sum, 2 for substraction, 3 for Multiplication and 4 for division");
        int operation=sc.nextInt();
        if(operation==1){
            System.out.println("Sum is ");
            System.out.println(a+b);
        }
        else if(operation==2){
            System.out.println("Subtraction is ");
            System.out.println(a-b);
        }
        else if(operation==3){
            System.out.println("Product is ");
            System.out.println(a*b);
        }
        else if(operation==4){
            System.out.println("Quotient is ");
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid operational desision choose again");
        }
        sc.close();
    }
}

