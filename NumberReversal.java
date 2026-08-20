import java.util.Scanner;

public class NumberReversal {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        System.out.println("berfore:"+num);
        int revNum = 0;
        while(num>0){
            int r = num%10;
            revNum = revNum*10+r;
            num = num/10;
        }
        num = revNum;
        System.out.println("after:"+num);
        
    }
}
