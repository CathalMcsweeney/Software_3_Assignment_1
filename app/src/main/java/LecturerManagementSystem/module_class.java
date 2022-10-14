/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturerManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2cath
 */
public class module_class {
    public String modName;
    public String modID;
    public lecturer_class lecturer;
    public List<course_program_class> associatedCourses= new ArrayList<>();
    public List<student_class> students= new ArrayList<>();

    //constructor
    public module_class(String modName, String modID) {
        this.modName = modName;
        this.modID = modID;
    }
    
    
    public String getModName() {
        return modName;
    }
    public void setModName(String modName) {
        this.modName = modName;
    }
    public String getModID() {
        return modID;
    }
    public void setModID(String modID) {
        this.modID = modID;
    }
    public lecturer_class getLecturer() {
        return lecturer;
    }
    public void setLecturer(lecturer_class lecturer) {
        this.lecturer = lecturer;
    }
    public List<course_program_class> getAssociatedCourses() {
        return associatedCourses;
    }
    public void setAssociatedCourses(course_program_class associatedCourse) {
        this.associatedCourses.add(associatedCourse);
    }
    public List<student_class> getStudents() {
        return students;
    }
    public void setStudents(student_class student) {
        this.students.add(student);
    }
    
}
