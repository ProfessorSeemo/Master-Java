package Comparison;

import Comparison.Student;

public class StudentTest {
    public static void main(String[] args) {

        // create five students
        Student s1 = new Student(1,"John","john@gmail.com");
        Student s2 = new Student(2,"Mike","mike@gmail.com");
        Student s3 = new Student(3,"Jane","jane@gmail.com");
        Student s4 = new Student(4,"Kate","kate@gmail.com");
        Student s5 = new Student(5,"Sara","sara@gmail.com");

        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s2));

        if (s1.compareTo(s2) > 0) {            System.out.println(true);
        }

    }

}
