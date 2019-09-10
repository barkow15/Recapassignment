package POJOs;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class School{
    private String       Name;
    private List<Course> Courses;
    private Dictionary   Students;

    public School(){
        this.Courses  = new ArrayList<>();
        this.Students = new Hashtable<String,Student>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Dictionary getStudents() {
        return Students;
    }

    public void setStudents(Dictionary students) {
        Students = students;
    }

    public List<Course> getCourses() {
        return Courses;
    }

    public void setCourses(List<Course> courses) {
        Courses = courses;
    }
}
