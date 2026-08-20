import java.util.Scanner;

public class Palindrome {

    void isPalindrome(){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        int orignalnumber = num;

         int revNum = 0;
        while(num>0){
            int r = num%10;
            revNum = revNum*10+r;
            num = num/10;
        }

        if(orignalnumber == revNum){
            System.err.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
    
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.isPalindrome();
        
}

