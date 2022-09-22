/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturerManagementSystem;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime; 

/**
 *
 * @author 2cath
 */
public class course_program_class {
    public String cName;
    public List<String> courseModules= new ArrayList<String>();
    public List<String> courseStudents= new ArrayList<String>();
    
    public DateTime startDate;
    public DateTime endDate;

    public course_program_class(String cName, DateTime startDate, DateTime endDate) {
        this.cName = cName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<String> getCourseModules() {
        return courseModules;
    }

    public void setCourseModules(List<String> courseModules) {
        this.courseModules = courseModules;
    }

    public List<String> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<String> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    
}
