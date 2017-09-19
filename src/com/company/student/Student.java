package com.company.student;

/**
 * Created by Daniil Sheidak on 19.09.2017.
 */
public class Student {
    public String id;
    public int course;
    public String faculty;
    public String name;

    public Student () {
        id = "";
        course = 1;
        faculty = "MMF";
        name = "student_name";
    }

    public Student (String id, int course, String faculty, String name) {
        this.id = id;
        this.course = course;
        this.faculty = faculty;
        this.name = name;
    }

    public boolean passExam() {
        if (id != "") {
            return true;
        }
        return false;
    }

    public void retire () {
        this.id = "";
    }

    public boolean recover (String id) {
        this.id = id;
        return  true;
    }

}
