

class Student{
    int rollNo;
    String name;
    String email;

    // zero argument or default constructor
    Student(){
          name = "Ananta";
    }

    // parameterized constructor
    Student(String name){
          this.name = name;
    }

    void acceptData(){
        name = "Ananta";
    }

    void display(){
        System.out.println("rollno:"+rollNo+ " name :"+name+ "+email:"+email);
    }
   
}



public class Demo01{


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s = new Student("Swapnil");
        s.display();
        s1.display();
    }

}

