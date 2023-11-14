public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();// created an object p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        Student s1 = new Student();
        s1.name ="sajid";
        s1.roll =455;
       s1.password = "anbc";

        s1.marks[0]=100;
       s1.marks[1]=90;
       s1.marks[2]=338;

       Student s2 = new Student(s1);//copy done
       s2.password = "xyx";
       s1.marks[2]=525;

       for (int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
       }

     
        // Student s2 = new Student("Sajid");
        // Student s3 = new Student(123);
        // Student s4 = new Student("aman",544);---Error
    }
}

// class Pen {
// // prop+func
// private String color;
// private int tip;

// String getColor() {
// return this.color;
// }

// int getTip(){
// return this.tip;
// }
// void setColor(String newColor) {
// this.color = newColor;
// }

// void setTip(int tip) {
// this.tip= tip;

// }
// }

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    class Adress{
         
    }

    // // shallow Copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //   this.name =s1.name;
    //   this.roll = s1.roll;
    //   this.marks=s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){
         marks = new int[3];
      this.name =s1.name;
      this.roll = s1.roll;
      for (int i = 0; i < marks.length; i++) {
        this.marks[i]=s1.marks[i];
      }
    }

Student(){
    marks = new int[3];
    System.out.println("Constructor is called..");
}


    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3]; 
        this.roll = roll;
    }
}