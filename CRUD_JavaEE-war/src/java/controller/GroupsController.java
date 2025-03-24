/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Groups;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.GroupsFacadeLocal;

/**
 *
 * @author Student 2
 */
@Named(value = "GroupsController")
@SessionScoped
public class GroupsController implements Serializable {
    
    @EJB
    private GroupsFacadeLocal GroupsFacade;

    private Groups selectedGroups;

    private Groups groups = new Groups();
    private String teacher;
    private String smoker;
    private Double weight;
    private String textbook_plant;
    
    public GroupsController() {
    }

    public Groups getSelectedGroups() {
        return selectedGroups;
    }

    public void setSelectedGroups(Groups selectedGroups) {
        this.selectedGroups = selectedGroups;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getTextbook_plant() {
        return textbook_plant;
    }

    public void setTextbook_plant(String textbook_plant) {
        this.textbook_plant = textbook_plant;
    }
        public List<Groups> getAllGroups() {
        return this.GroupsFacade.findAll();
    }

    public void emptyVariables() {
        this.smoker = "";
        this.teacher = "";
        this.weight = 0.0;
        this.textbook_plant = "";
    }

    public String createGroups() {
        this.groups.setSmoker(this.smoker);
        this.groups.setTeacher(this.teacher);
        this.groups.setWeight(this.weight);
        this.groups.setTextbookPlant(this.textbook_plant);
        this.GroupsFacade.create(this.groups);
        this.emptyVariables();
        return "LeftPage(group).xhtml?faces-redirect=true";
    }

    public String updateGroups(Groups groups) {
        this.GroupsFacade.edit(this.selectedGroups);
        return "LeftPage(group).xhtml?faces-redirect=true";
    }

    public String deleteGroups(Groups groups) {
        this.GroupsFacade.remove(groups);
        return "LeftPage(group).xhtml?faces-redirect=true";
    }

}
