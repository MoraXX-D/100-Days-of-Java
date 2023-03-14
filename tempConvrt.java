import java.util.Scanner;

// program to convert Fahrenheit to celcius 
public class tempConvrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in farenheit");
        float fahrenheitTemp=sc.nextFloat();
        float celciusTemp = (((fahrenheitTemp - 32) * 5)/9);
        System.out.println("Temprature in celcius scale is : " + celciusTemp + "*C");

        sc.close();
    }
}
