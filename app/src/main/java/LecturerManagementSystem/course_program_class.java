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
    public List<module_class> courseModules= new ArrayList<>();
    public List<student_class> courseStudents= new ArrayList<>();
    
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

    public List<module_class> getCourseModules() {
        return courseModules;
    }

    public void setCourseModules(module_class courseModule) {
        this.courseModules.add(courseModule);
    }

    public List<student_class> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(student_class courseStudent) {
        this.courseStudents.add(courseStudent);
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
