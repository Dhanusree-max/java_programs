/*class Student {
    int rollno;
    String name;
    int marks;
}
public class arrayobject {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "dhanu";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "harsh";
        s2.marks = 34;

        Student s3 = new Student();
        s3.rollno = 37;
        s3.name = "john";
        s3.marks = 99;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " : " + students[i].marks);
        // }
        for (Student stud : students) { // enhanced for loop or for-each loop
            System.out.println(stud.name + " : " + stud.marks + " - " + stud.rollno);
        }
    }
}*/

// array of objects
/*import java.util.Scanner;
import java.io.*;

class First {
    int a;
    String name;

    public First(int n, String name) {
        a = n;
        this.name = name;
    }
}

public class arrayobject {
    public static void main(String[] args) throws IOException {
        First obj[] = new First[2];
        obj[0] = new First(10, "A");
        obj[1] = new First(20, "B");
        System.out.println(obj[0].a + " " + obj[0].name);
        System.out.println(obj[1].a + " " + obj[1].name);
    }
}*/
// This is only main method

/*class arrayofobjects{
    public static void main(String[] args) {
        Student[] arr={
            new Student(1,"Bindu"),
            new Student(2,"Anu"),
            new Student(3,"Ravi");
        };
        for(Student s:arr){
            s.display();
        }
    }
}*/
import java.util.Scanner;
import java.io.*;

//Array of objects getting inputs dynamically
class First {
    int a;
    String name;

    public First(int n, String name) {
        a = n;
        this.name = name;
    }
}

public class arrayobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // 1️⃣ Create array
        First[] obj = new First[size];
        // 2️⃣ Create objects and store
        for (int i = 0; i < size; i++) {
            int a = sc.nextInt();
            String name = sc.next();
            obj[i] = new First(a, name);
        }
        // 3️⃣ Display
        for (int i = 0; i < size; i++) {
            System.out.println(obj[i].a + " " + obj[i].name);
        }
    }
}