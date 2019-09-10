package BusinessLogic;

import POJOs.Course;

import java.util.List;

public class BLCourse {
    public List<Course> createCourse(List<Course> courses, String name) {
        int courseID = 1;

        // If List of courses is not empty get the size og the List and add 1 so the ID is autoincremented
        if(!courses.isEmpty()){
            // Get the ID of the last course in the ArrayList
            courseID = courses.get((courses.size()) -1).getID();

            // Increment by 1
            courseID = courseID + 1;
        }
        Course c = new Course(courseID, name);

        // Add the course to List > Courses
        courses.add(c);
        // Set courses with the added course
        return courses;
    }
}
