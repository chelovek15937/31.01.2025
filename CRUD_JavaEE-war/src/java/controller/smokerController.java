/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Smoker;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.SmokerFacadeLocal;

/**
 *
 * @author Student 2
 */
@Named(value = "SmokerController")
@SessionScoped
public class smokerController implements Serializable {

    @EJB
    private SmokerFacadeLocal SmokerFacade;

    private Smoker selectedSmoker;

    private Smoker smoker = new Smoker();
    private String groups;
    private double weight;
    private String textbook_plant;
    private String name_mother_father;

    public smokerController() {
    }

    public Smoker getSelectedSmoker() {
        return selectedSmoker;
    }

    public void setSelectedSmoker(Smoker selectedSmoker) {
        this.selectedSmoker = selectedSmoker;
    }

    public Smoker getSmoker() {
        return smoker;
    }

    public void setSmoker(Smoker smoker) {
        this.smoker = smoker;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTextbook_plant() {
        return textbook_plant;
    }

    public void setTextbook_plant(String textbook_plant) {
        this.textbook_plant = textbook_plant;
    }

    public String getName_mother_father() {
        return name_mother_father;
    }

    public void setName_mother_father(String name_mother_father) {
        this.name_mother_father = name_mother_father;
    }

    public List<Smoker> getAllSmoker() {
        return this.SmokerFacade.findAll();
    }

    public void emptyVariables() {
        this.groups = "";
        this.weight = 0.0;
        this.textbook_plant = "";
        this.name_mother_father = "";
    }

    public String createSmoker() {
        this.smoker.setGroups(this.groups);
        this.smoker.setWeight(this.weight);
        this.smoker.setTextbookPlant(this.textbook_plant);
        this.smoker.setNamemotherfather(this.name_mother_father);
        this.SmokerFacade.create(this.smoker);
        this.emptyVariables();
        return "LeftPage(smoker).xhtml?faces-redirect=true";
    }

    public String updateSmoker(Smoker smoker) {
        this.SmokerFacade.edit(this.selectedSmoker);
        return "LeftPage(smoker).xhtml?faces-redirect=true";
    }

    public String deleteSmoker(Smoker smoker) {
        this.SmokerFacade.remove(smoker);
        return "LeftPage(smoker).xhtml?faces-redirect=true";
    }
}
