package com.shahadat.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "roll no: " + rollno + " marks: " + marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);

        // if dif == 0; they are equal
        // if dif < 0; means `o` is bigger else `o` is smaller
        return diff;
    }
}
