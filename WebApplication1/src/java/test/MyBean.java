/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
@Named(value = "MyBean")
@SessionScoped
public class MyBean implements Serializable {
    private String name,program,branch,section,gender,email,mobile;
    String[] branches={" "," "," "};
    String[] sections={" "," "," "};
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public String getBranch() {
        return branch;
    }

    public String[] getBranches() {
        return branches;
    }

    public void setProgram(String program) {
        this.program = program;
        if(program.equals("b.tech")){
            branches[0]="CSE";
            branches[1]="ECE";
            branches[2]="EEE";
        }
        else{
            branches[0]="VLSI";
            branches[1]="ML";
            branches[2]="AI";
        }
    }

    public void setBranch(String branch) {
        this.branch = branch;
        sections[0]="A";
        sections[1]="B";
        sections[2]="C";
    }

    public void setBranches(String[] branches) {
        this.branches = branches;
    }

    public String getSection() {
        return section;
    }

    public String[] getSections() {
        return sections;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSections(String[] sections) {
        this.sections = sections;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
}
