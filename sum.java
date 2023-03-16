import java.util.Scanner;

public class sum {
    int a,b;
    sum(int a, int b){
        this.a = a;
        this.b = b;
    }
    int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no = ");
        int a = sc.nextInt();
        System.out.print("Enter the second no = ");
        int b = sc.nextInt();

        sum obj1 = new sum(a,b);
        int result = obj1.add(a,b);
        System.out.println("Sum is " + result);
        sc.close();
        
    }
}
