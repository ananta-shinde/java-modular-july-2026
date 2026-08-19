public class LoopDemo {

    int count = 0; // class level or data menber or properties

   void printMessage(String message){
    //   String message = "this is my message";   // local
      System.out.println(message);
   }

   void printSeries(){
          //  for(initialization; condition ; increment/decrement){}
          for(int i=1;i<=100;i++){
            if(i%4 == 0){
                System.out.println(i);
            }
             
          }
   }

   public static void main(String[] args) {

      LoopDemo obj = new LoopDemo();
      obj.printMessage("this is first message");
      obj.printSeries();
     
   }
    
}
