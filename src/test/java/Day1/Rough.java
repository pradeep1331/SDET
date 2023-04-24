package Day1;

import javafx.fxml.Initializable;
import org.omg.CORBA.INITIALIZE;

import java.util.ArrayList;

public class Rough {

    public static void main(String[] args) {

        Rough r1 = new Rough();

        r1.findData(r1);
        r1.equals(null);

        ArrayList<Integer> A1 = new ArrayList<Integer>();


    }

    public void findData(Rough r1){
        String s1 = new String("Bat");
        System.out.println(s1.hashCode());
        System.out.println(new String("Bat").hashCode());
        System.out.println(r1.hashCode());

        Student S1 = new Student("john",20,1234);
        Student S2 = new Student("doe",20,1234);
        Student S3 = new Student("john",20,1234);

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println(S3.hashCode());
        System.out.println(S1.equals(S3));
    }

    class Student{

        public String name;
        public int age;
        public int rollno;

        Student(String name,int age,int rollno){
            this.age = age;
            this.name = name;
            this.rollno = rollno;
        }

         @Override
        public boolean equals(Object obj){

            return (this.rollno == ((Student)obj).rollno);

         }


    }
}
