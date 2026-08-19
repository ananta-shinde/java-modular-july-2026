import java.util.Scanner;

class Factorial{

    public static void main(String[] args) {
        int factorial = 1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        number = sc.nextInt();
        for(int num=number;num>=1;num--){
            factorial = factorial*num;    
        }
         System.out.println(factorial);
    }
}