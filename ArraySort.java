import java.util.*;
public class ArraySort {

    
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

///------------------------------>>> Accending order <<<-----------------------------------------

    public int ArraySorting(int arr[],int n)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                { 
                    minIndex=j;
                }
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            } 
        }
        return 0;
}

///----------------------->>>  decending order  <<<-----------------------------------------

public int ArraySortDec(int arr[],int n)
{
    
    for(int i=0;i<arr.length;i++)
    {
        int maxIndex=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[maxIndex])
            { 
                maxIndex=j;
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        } 
    }
    return 0;
}
   public static void main(String[] args) {
    ArraySort obj=new ArraySort();
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the size of array ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the element of array ");
    obj.getArray(arr, n);
    System.out.println("Your array is ");
    obj.displayArray(arr, n);
    System.out.println("\nYour array after sorting in accending order --> ");
    obj.ArraySorting(arr, n);
    obj.displayArray(arr, n);
    System.out.println("\nYour array after sorting in decending order --> ");
    obj.ArraySortDec(arr, n);
    obj.displayArray(arr, n);
    
    sc.close();
   } 
}


