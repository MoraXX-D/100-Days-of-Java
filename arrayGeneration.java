//program to get an array and then dividing it into an array of even and odd.

import java.util.Scanner;

public class arrayGeneration {
    public void getArray(int arr[],int n)
    {
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    public void displayArray(int arr[],int n)
    {
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }  
    }
    public void EvenArray(int arr[],int n,int eve[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            eve[i]=arr[i];
            if(arr[i]%2==0)
            {
                System.out.print(eve[i]+" ");
            }
        }
    }
    public void OddArray(int arr[],int n,int odd[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            odd[i]=arr[i];
            if(arr[i]%2!=0)
            {
                System.out.print(odd[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        arrayGeneration obj=new arrayGeneration();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements ");
        obj.getArray(arr, n);
        System.out.println("Your Array is ");
        obj.displayArray(arr, n);
        int eve[]=new int[arr.length];
        System.out.println("\nArray of even no is ");
        obj.EvenArray(arr, n, eve);
        System.out.println("\nArray of odd no is ");
        obj.OddArray(arr, n, eve);
        sc.close();
    }
}