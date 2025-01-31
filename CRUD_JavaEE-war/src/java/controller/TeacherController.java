/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Teacher;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.TeacherFacadeLocal;

@Named(value = "TeacherController")
@SessionScoped
public class TeacherController implements Serializable {

    @EJB
    private TeacherFacadeLocal TeacherFacade;

    private Teacher selectedTeacher;

    private Teacher teacher = new Teacher();
    private String conference;
    private String student;
    private double weight;
    private String mother_father;

    public TeacherController() {
    }

    public Teacher getSelectedTeacher() {
        return selectedTeacher;
    }

    public void setSelectedTeacher(Teacher selectedTeacher) {
        this.selectedTeacher = selectedTeacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMother_father() {
        return mother_father;
    }

    public void setMother_father(String mother_father) {
        this.mother_father = mother_father;
    }

    public List<Teacher> getAllTeacher() {
        return this.TeacherFacade.findAll();
    }

    public void emptyVariables() {
        this.conference = "";
        this.student = "";
        this.weight = 0.0;
        this.mother_father = "";
    }

    public String createTeacher() {
        this.teacher.setConference(this.conference);
        this.teacher.setStudent(this.student);
        this.teacher.setWeight(this.weight);
                this.teacher.setMotherFather(this.mother_father);
        this.TeacherFacade.create(this.teacher);
        this.emptyVariables();
        return "LeftPage(teacher).xhtml?faces-redirect=true";
    }

    public String updateTeacher(Teacher teacher) {
        this.TeacherFacade.edit(this.selectedTeacher);
        return "LeftPage(teacher).xhtml?faces-redirect=true";
    }

    public String deleteTeacher(Teacher teacher) {
        this.TeacherFacade.remove(teacher);
        return "LeftPage(teacher).xhtml?faces-redirect=true";
    }

}
