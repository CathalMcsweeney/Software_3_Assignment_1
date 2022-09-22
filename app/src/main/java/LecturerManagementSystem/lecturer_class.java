/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturerManagementSystem;

import java.util.Date;
import java.util.*;

/**
 *
 * @author 2cath
 */
public class lecturer_class {
    public String name;
    public int age;
    public Date dob;
    public String id;
    public String username;
    public List<String> modulesTaught= new ArrayList<String>();

    public lecturer_class(String name, int age, Date dob, String id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = createUsername(name, age);
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getModulesTaught() {
        return modulesTaught;
    }

    public void setModulesTaught(List<String> modulesTaught) {
        this.modulesTaught = modulesTaught;
    }
    
     
    public String createUsername(String name, int age){
        String n = name;
        String a = String.valueOf(age);
        String usern = n.concat(a);
        return usern;
    }
}
