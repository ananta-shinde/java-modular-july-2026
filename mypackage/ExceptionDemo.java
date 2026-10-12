package mypackage; 

 class InvalidAgeException extends Exception{

    InvalidAgeException(){
       super("invalid age for the action");
    }

}

public class ExceptionDemo{

    public void  isValidVoter(int age) throws InvalidAgeException,Exception{
        
            if(age>18){
                System.out.println("valid");
            }else{
                throw new InvalidAgeException();
            }
       
    }
    public static void main(String[] args) {
       
            ExceptionDemo demo  = new ExceptionDemo();
            try{
                 demo.isValidVoter(15);
            }catch(Exception e){
                System.err.println(e);
            }
           
        
        
    }

}