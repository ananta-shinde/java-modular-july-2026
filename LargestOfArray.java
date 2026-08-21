import java.util.Scanner;

public class LargestOfArray {

    public static void main(String[] args) {
        int size;
        System.out.println("enter count of values:");
        Scanner scanner = new Scanner(System.in);
        size =scanner.nextInt();
        
        int[] nums = new int[size];

        String[] names = new String[100];

        nums[6] = 34;

        for(int i=0;i<size;i++){
            System.out.println("enter a number:");
            nums[i]=scanner.nextInt();
        }

        System.out.println("********** your numbers are :***********");
        
         for(int i=0;i<size;i++){
            System.out.println(nums[i]);
         }
        
      
        System.out.println("*********************");
        int sum = 0;
         for(int i=0;i<size;i++){
            sum =sum+nums[i];
         }
         System.err.println("sum of numbers is :"+ sum);

         System.out.println("*********************");
         int largest =nums[0];
          for(int i=0;i<size;i++){
             if(nums[i]>= largest){
                largest = nums[i];
             }
         }
         System.out.println("largest number in array is:"+largest);

         System.out.println("*********************");
         int smallest =nums[0];
          for(int i=0;i<size;i++){
             if(nums[i]<= smallest){
                smallest = nums[i];
             }
         }
         System.out.println("smallest number in array is:"+smallest);
    }
    
}
