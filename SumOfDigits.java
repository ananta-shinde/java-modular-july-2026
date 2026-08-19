import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        num = sc.nextInt();
        int sum = 0;
        while(num>0){ 
            int lastdigit = num%10;
            sum = sum + lastdigit;
            num = num/10;
        }
        System.err.println(sum);
    }
}
