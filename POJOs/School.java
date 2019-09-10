package POJOs;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class School implements ISchool {
    private String       Name;
    private List<Course> Courses;
    private Dictionary   Students;

    public School(String name){
        this.Name = name;
        this.Courses  = new ArrayList<>();
        this.Students = new Hashtable<String,Student>();
    }
    @Override
    public void createCourse(String name) {
        int courseID = 1;
        List<Course> courses = this.Courses;

        // If List of courses is not empty get the size og the List and add 1 so the ID is autoincremented
        if(!this.Courses.isEmpty()){
            // Get the ID of the last course in the ArrayList
            courseID = courses.get((courses.size()) -1).getID();

            // Increment by 1
            courseID = courseID + 1;
        }
        Course c = new Course(courseID, name);

        // Add the course to List > Courses
        this.Courses.add(c);
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