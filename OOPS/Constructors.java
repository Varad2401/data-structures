public class Constructors {

    public static void main(String[] args) {
    
    Student s1 = new Student("Varad");
    System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
    
    Student(String name){
      this.name = name;
    }
  }