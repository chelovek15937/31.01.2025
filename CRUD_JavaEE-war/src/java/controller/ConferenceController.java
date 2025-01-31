package controller;

import entities.Conference;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.ConferenceFacadeLocal;

@Named(value = "ConferenceController")
@SessionScoped
public class ConferenceController implements Serializable {

    @EJB
    private ConferenceFacadeLocal ConferenceFacade;

    private Conference selectedConference;

    private Conference conference = new Conference();
    private String teacher;
    private String student;

    public ConferenceController() {
    }

    public Conference getSelectedConference() {
        return selectedConference;
    }

    public void setSelectedConference(Conference selectedConference) {
        this.selectedConference = selectedConference;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public List<Conference> getAllConference() {
        return this.ConferenceFacade.findAll();
    }

    public void emptyVariables() {
        this.student = "";
        this.teacher = "";
    }

    public String createConference() {
        this.conference.setStudent(this.student);
        this.conference.setTeacher(this.teacher);
        this.ConferenceFacade.create(this.conference);
        this.emptyVariables();
        return "LeftPage(conference).xhtml?faces-redirect=true";
    }

    public String updateConference(Conference Conference) {
        this.ConferenceFacade.edit(this.selectedConference);
        return "LeftPage(conference).xhtml?faces-redirect=true";
    }

    public String deleteConference(Conference Conference) {
        this.ConferenceFacade.remove(Conference);
        return "LeftPage(conference).xhtml?faces-redirect=true";
    }

}
