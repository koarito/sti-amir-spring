package sti.amir.ali.service;

import sti.amir.ali.domain.Course;
import sti.amir.ali.domain.Student;
import sti.amir.ali.domain.Teacher;

import java.util.List;

public interface AmirAliService {
    Student getStudent(long personNmr, List<Student> students);

    Student createStudent(String givenName, String surname, List<Course> courses, String computer, long personmr);

    void addCourse(Student student, Course course);

    void removeCourse(Student student, int courseCode);

    int calcSalary(Teacher teacher);

    int calcAverageSalary(List<Teacher> teachers);
}
