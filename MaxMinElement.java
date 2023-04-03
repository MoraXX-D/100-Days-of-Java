import java.util.*;
public class MaxMinElement {
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
    public int min(int arr[],int n)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        return min;
    }
    public int max(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        MaxMinElement obj=new MaxMinElement();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the emement of array ");
        obj.getArray(arr, n);
        System.out.println("your Array is ");
        obj.displayArray(arr, n);
        System.out.println("\nMinimum element of array is ");
        System.out.println(obj.min(arr, n));
        System.out.println("Maximum element of array is ");
        System.out.println(obj.max(arr, n));        


        sc.close();
    }
}
