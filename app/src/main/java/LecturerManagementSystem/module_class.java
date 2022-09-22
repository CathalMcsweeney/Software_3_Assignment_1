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
    public String lecturer;
    
    public List<String> associatedCourses= new ArrayList<String>();
    public List<String> students= new ArrayList<String>();

    public module_class(String modName, String modID, String lecturer) {
        this.modName = modName;
        this.modID = modID;
        this.lecturer = lecturer;
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

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public List<String> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(List<String> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }
    
}
