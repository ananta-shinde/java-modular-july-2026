import java.util.Scanner;
import java.util.Vector;

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

class StudentManager{
    // Student[] studList = new Student[5];
    Vector<Student> studList = new Vector<Student>();
    private int count = 0;

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
            // studList[count] = s;
            studList.add(s);
            count++;
        }else{
            System.err.println("studnet list is full");
        }
    }

    private Student getStudentByRollNo(int rollno){
        for(int i=0;i<count;i++){
            if(studList.get(i).rollNo == rollno){
                return studList.get(i);
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

    void removeStudent(int rollno){
        Student s = getStudentByRollNo(rollno);
        studList.remove(s);
        count--;
    }

    void printStudentList(){
        for(int i=0;i<count;i++){
           Student s = studList.get(i);
           System.out.println("name: "+s.name+" email:"+s.email);
        }
    }

}

class CourseManager{

    Vector<Course> courseList = new Vector();
    int count = 0;

    void createCourse(){
        Course course = new Course();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter course name:");
        course.name = scanner.next();
        System.out.println("enter course description:");
        course.description = scanner.next();
        System.out.println("enter max marks:");
        course.maxMarks = scanner.nextInt();
        course.id = count+1;
        courseList.add(course);
        count++;
    }

    private Course getCourseById(int id){
        for(int i=0;i<count;i++){
            if(courseList.get(i).id == id){
                return courseList.get(i);
            }
        }
        return null;
    }

    void updateCourseName(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter course id to update :");
         int id = scanner.nextInt();
        Course c = getCourseById(id);
        if(c !=null){
            System.out.println("enter course name:");
            c.name = scanner.next();
            System.out.println("course updated successfully");
        }else{
            System.out.println("course not found");
        }
        
    }

     void printCourseList(){
        for(int i=0;i<count;i++){
           Course c = courseList.get(i);
           System.out.println("name: "+c.name+" decription:"+c.description);
        }
    }

}


public class App {

    StudentManager studentManager = new StudentManager();
    CourseManager courseManager = new CourseManager();


    public static void main(String[] args) {
      
        App app = new App();
       
       
        

    }
}
