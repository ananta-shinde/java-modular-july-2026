import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

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
     Address address =new Address();
     Course course;
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

    Student getStudentByRollNo(int rollno){
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

    Vector<Course> courseList;
    int count;

    CourseManager(){
        courseList = new Vector<>();
        count = 0;
    }



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

     Course getCourseById(int id){
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

class EnrollManager{

     CourseManager cm;
     StudentManager sm;

     EnrollManager(CourseManager cm,StudentManager sm){
            this.cm = cm;
            this.sm = sm;
     }

      void assignCourse(int rollno,int courseId){
               
                Student s = sm.getStudentByRollNo(rollno);
                s.course = cm.getCourseById(courseId);
        }
    
     void unassignCourse(int rollno){
                
                Student s = sm.getStudentByRollNo(rollno);
                s.course = null;
        }
}


public class App {

    StudentManager studentManager;
    CourseManager courseManager ;
    EnrollManager enrollManager ;

    App(){
        studentManager = new StudentManager();
        courseManager = new CourseManager();
        enrollManager = new EnrollManager(courseManager, studentManager);
    }

    public static void main(String[] args) {
      
        App app = new App();
        app.courseManager.createCourse();
        app.studentManager.createStundent();
        app.enrollManager.assignCourse(1, 1);

    }
}
