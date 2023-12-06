import StudentManagement.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("******* Add Student *******");
        st.addStudent(students, new Student("Bh001","Dao Huy Viet",10));
        st.addStudent(students, new Student("Bh002","Dao Thi Mai Chi",9));
        st.addStudent(students, new Student("Bh003","Dao Huy Dai",8));
        st.addStudent(students, new Student("Bh004","Dao Huy B",6));
        st.addStudent(students, new Student("Bh005","Dao Huy T",7));
        System.out.println("********** List data of students **********");
        for (Student s: students){
            System.out.println("ID : "+ s.id + ", FullName = "+ s.fullName + ", Mark = "+s.mark + ", Rank = "+s.rank);
        }

        System.out.println("************* Edit Student *************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudent(students,2,new Student("BH009","Teo",5));
        System.out.println("********** List data of students after updated **********");
        for (Student s: students){
            System.out.println("ID : "+ s.id + ", FullName = "+ s.fullName + ", Mark = "+s.mark + ", Rank = "+s.rank);
        }

        System.out.println("************* Edit Student By Id *************");
        edit.editStudentById(students,"BH009",new Student("BH009","Ty",9.0));
        System.out.println("********** List data of students after updated by ID **********");
        for (Student s: students){
            System.out.println("ID : "+ s.id + ", FullName = "+ s.fullName + ", Mark = "+s.mark + ", Rank = "+s.rank);
        }

        System.out.println("************* Remove Student *************");
        ArrayListRemoveStudent remove = new ArrayListRemoveStudent();
        remove.removeStudentById(students,"BH009");
        System.out.println("********** List data of students after updated by ID **********");
        for (Student s: students){
            System.out.println("ID : "+ s.id + ", FullName = "+ s.fullName + ", Mark = "+s.mark + ", Rank = "+s.rank);
        }

        System.out.println("************* Binary Search Student *************");
        ArrayListSearchStudent searchStudent = new ArrayListSearchStudent();
        String numberId = "Bh001";
        int findSt = searchStudent.binarySearch(students,numberId);
        if(findSt == -1){
            System.out.println("Can not found id : " + numberId);
        }else {
            System.out.println("Found id : " + numberId);
        }

        System.out.println("************* Sort Student by ID *************");
        Collections.sort(students,Student.IdStudentComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************* Sort Student by FullName *************");
        Collections.sort(students,Student.FullNameStudentComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************* Sort Student by Mark *************");
        Collections.sort(students,Student.MarkComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }
    }
}