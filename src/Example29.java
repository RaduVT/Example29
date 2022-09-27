import java.util.Scanner;

public class Example29 {
    public static void main(String[] args){

        int divisor, dividend, i;

        Scanner importValue;
        importValue = new Scanner(System.in);

        System.out.println("Enter dividend: ");
        dividend = importValue.nextInt();

        System.out.println("enter divisor: " );
        divisor = importValue.nextInt();
        while (dividend >= divisor) {
            dividend = dividend - divisor;
        }
        System.out.println("Remainder: " + dividend);
    }
}

