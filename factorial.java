import java.util.Scanner;

public class factorial {
    public int fact(int n){
        int fc;
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            fc=n*fact(n-1);
        }
        return fc;
    }
    public static void main(String[] args) {
        System.out.println("Enter the no-> ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        factorial obj1=new factorial();
        int ans= obj1.fact(n);
        System.out.println(ans);
        sc.close();
    }
}
