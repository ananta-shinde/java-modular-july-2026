import java.util.Scanner;

public class PositveOrNegative{

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        num = scanner.nextInt();
        if(num >= 0){
               System.out.println("the number is positive");
        }else{
            System.out.println("number is negative");
        }
      
    }
}

