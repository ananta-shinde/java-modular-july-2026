import java.util.Scanner;

public class AmstrongNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int orignalnumber = sc.nextInt();
        int num = orignalnumber;

        
        // calculate length of number
        int count = 0;
        while(num>0){
               num=num/10;
               count++;
        }

        num = orignalnumber;
        int sum = 0;
        while(num>0){
            int lastdigit = num%10;
            sum = sum + (int)Math.pow(lastdigit, count);
            num = num/10; 
        }

        if(sum == orignalnumber){
            System.err.println("number is amstrong ");
        }else{
            System.err.println("number is not amstrong");
        }
    }
}
