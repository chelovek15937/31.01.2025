/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Student;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.StudentFacadeLocal;

/**
 *
 * @author Student 2
 */
@Named(value = "studentController")
@SessionScoped
public class studentController implements Serializable {

    @EJB
    private StudentFacadeLocal StudentFacade;

    private Student selectedStudent;

    private Student student = new Student();
    private String smoker;
    private String teacher;
    private String conference;
    private String mother_father;

    public studentController() {
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student Student) {
        this.student = Student;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getMother_father() {
        return mother_father;
    }

    public void setMother_father(String mother_father) {
        this.mother_father = mother_father;
    }

    public List<Student> getAllStudent() {
        return this.StudentFacade.findAll();
    }

    public void emptyVariables() {
        this.smoker = "";
        this.teacher = "";
        this.conference = "";
        this.mother_father = "";
    }

    public String createStudent() {
        this.student.setSmoker(this.smoker);
        this.student.setTeacher(this.teacher);
        this.student.setConference(this.conference);
        this.student.setMotherFather(this.mother_father);
        this.StudentFacade.create(this.student);
        this.emptyVariables();
        return "LeftPage(student).xhtml?faces-redirect=true";
    }

    public String updateStudent(Student student) {
        this.StudentFacade.edit(this.selectedStudent);
        return "LeftPage(student).xhtml?faces-redirect=true";
    }

    public String deleteStudent(Student student) {
        this.StudentFacade.remove(student);
        return "LeftPage(student).xhtml?faces-redirect=true";
    }

}
