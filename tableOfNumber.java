import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no you want the table of ");
        int number = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(number + " X " + i + " = " + number*i );
        }
        sc.close();
    }
}
