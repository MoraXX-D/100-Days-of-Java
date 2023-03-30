import java.util.Scanner;

//Create a function that takes in an array (slot machine outcome) and returns true if all elements in the array are identical,
// and false otherwise. The array will contain 4 elements.
   
public class jackpot {
    Scanner sc = new Scanner(System.in);
    public void arrayInput(String arr[]){
        for(int i = 0; i<4 ;i++){
            String c=sc.nextLine();
            arr[i]= c;
        }
    }

    public boolean isWinner(String arr[]){
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]){
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        String arr[] = new String[4];
        jackpot obj = new jackpot();
        System.out.println("Enter the array ");
        obj.arrayInput(arr);;
        if(obj.isWinner(arr)){
            System.out.println("winner");
        }
        else{
            System.out.println("try again");
        }
    }
}
