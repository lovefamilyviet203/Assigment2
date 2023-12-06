package StudentManagement;

import java.util.Comparator;

public class Student {
    public String fullName;
    public String id;
    public double mark;
    public String rank;
    public Student(String id, String fullName, double mark){
        this.id = id;
        this.fullName = fullName;
        this.mark = mark;
        if(this.mark >=0 && this.mark< 5.0){
            this.rank = "Fail";
        } else if (this.mark >=5 && this.mark < 6.5) {
            this.rank = "Medium";
        } else if (this.mark >= 6.5 && this.mark <7.5) {
            this.rank = "Good";
        } else if (this.mark >= 7.5 && this.mark <9.0) {
            this.rank = "Very Good";
        } else if (this.mark >= 9.0 && this.mark <=10) {
            this.rank = "Excellent";
        }else {
            this.rank = null;
        }
    }

    //getter and setter java
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public double getMark(){
        return mark;
    }
    public void setMark(double mark){
        this.mark = mark;
    }
    /*
    @Override
    public int compareTo(Student compareStudent) {
        if (this.mark < compareStudent.getMark()){
            return -1;
        } else if (compareStudent.getMark() < this.mark) {
            return 1;
        }
        return 0;
    }
    */
    public static Comparator<Student> IdStudentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            String idStudent1 = o1.getId().toUpperCase();
            String idStudent2 = o2.getId().toUpperCase();
            return idStudent1.compareTo(idStudent2);
        }
    };
    public static Comparator<Student> FullNameStudentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            String fullNameStudent1 = o1.getFullName().toUpperCase();
            String fullNameStudent2 = o2.getFullName().toUpperCase();
            return fullNameStudent1.compareTo(fullNameStudent2);
        }
    };
    public static Comparator<Student> MarkComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            double markStudent1 = o1.getMark();
            double markStudent2 = o2.getMark();
            if( markStudent1 < markStudent2){
                return -1;
            } else if (markStudent2 < markStudent1) {
                return 1;
            }
            return 0;
        }
    };
    @Override
    public String toString() {
        return "[ID = "+ id +", FullName = "+ fullName +", Mark = "+ mark +", Rank = "+ rank +"]";
    }
}
