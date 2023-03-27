import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row and coloumn");
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the element of the array ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" "); 
            }
        System.out.println();
        }
        sc.close();
    }
    
}
