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
            s.rollNo = count+1;
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

    Student getStudentByRollNo(int rollno){
        for(int i=0;i<count;i++){
            if(studList[i].rollNo == rollno){
                return studList[i];
            }
        }
        return null;
    }

    void updateStudentName(int rollNo,String newname){
        Student s = getStudentByRollNo(rollNo);
        if(s == null){
            System.out.println("no student found for roll no."+ rollNo);
        }else{
            s.name = newname;
            System.out.println("name was updated successfully");
        }
    }

    void printstudentDetails(int rollno){
        Student s = getStudentByRollNo(rollno);
        System.out.println("name: "+s.name+" email:"+s.email);
    }



    public static void main(String[] args) {
      
        App app = new App();
        app.createStundent();
        app.printstudentDetails(1);
        app.updateStudentName(1, "Ananta");
        app.printstudentDetails(1);
        

    }
}
