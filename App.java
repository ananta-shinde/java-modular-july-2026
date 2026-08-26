import java.util.Scanner;

class Address{
    String localarea;
    String city;
    String state;
    int picode;
}


class Student{
     int rollNo;
     String name;
     String email;
     Address address = new Address();
}

class Course{
     int id;
     String name;
     double maxMarks;
     String description;
}


public class App {

    Student[] studList = new Student[5];
    int count = 0;

    void createStundent(){

        if(count<5){
            Student s = new Student();
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name:");
            s.name = scanner.next();
            System.out.println("enter your email:");
            s.email = scanner.next();
            System.out.println("enter your address :");
            System.out.println("local area:");
            s.address.localarea = scanner.next();
            System.out.println("enter city:");
            s.address.city = scanner.next();
            System.out.println("enter state:");
            s.address.state = scanner.next();
            System.out.println("enter picode:");
            s.address.picode = scanner.nextInt();
            studList[count] = s;
            count++;
        }else{
            System.err.println("studnet list is full");
        }
    }


    public static void main(String[] args) {
      
        App app = new App();
       


    }
}
