package sigleton;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();
        Student s4 = Student.getStudent();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }



}
