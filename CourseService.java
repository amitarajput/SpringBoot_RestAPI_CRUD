package Service;

import binding.Course;

import java.util.List;

public interface CourseService {
    public String upsert(Course course); //upsert is update and insert
    public Course getById(Integer cid);
    public List<Course> getAllCourses();
    public String deleteById(Integer cid);

}
