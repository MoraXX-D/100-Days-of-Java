import java.util.*;
///------------------------------->>> Function to get array input <<<-------------------------------------------///
public class arraySum {
    public void getArray(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

///--------------------------------->>>Function to display Array <<<---------------------------------------------///

    public void displayArray(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");

        }

    }

///--------------------------------->>> Function to find sum  <<<--------------------------------------------------///

    public int sum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

///---------------------------------->>> Function to find prime no in an array <<<-----------------------------------///

    public void Prime(int arr[], int size) {
        for(int i=0; i<arr.length; i++){
            boolean isPrime = true;

            for (int j=2; j<arr[i]; j++){

                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)

            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        arraySum obj = new arraySum();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array ");
        obj.getArray(arr, n);
        obj.displayArray(arr, n);
        System.out.println("\nSum of Array element = " + obj.sum(arr, n));
        System.out.println("prime no is the entered array is -> ");
        obj.Prime(arr, n);

        sc.close();
    }
}
