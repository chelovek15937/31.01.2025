/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Kafedra;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.KafedraFacadeLocal;

/**
 *
 * @author Student 2
 */
@Named(value = "KafedraController")
@SessionScoped
public class kafedraController implements Serializable {

    @EJB
    private KafedraFacadeLocal KafedraFacade;

    private Kafedra selectedKafedra;

    private Kafedra kafedra = new Kafedra();
    private String name;
    private String groups;
    private String textbook_plant;
    public kafedraController() {
    }

    public Kafedra getSelectedKafedra() {
        return selectedKafedra;
    }

    public void setSelectedKafedra(Kafedra selectedKafedra) {
        this.selectedKafedra = selectedKafedra;
    }

    public Kafedra getKafedra() {
        return kafedra;
    }

    public void setKafedra(Kafedra kafedra) {
        this.kafedra = kafedra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getTextbook_plant() {
        return textbook_plant;
    }

    public void setTextbook_plant(String textbook_plant) {
        this.textbook_plant = textbook_plant;
    }
    
            public List<Kafedra> getAllKafedra() {
        return this.KafedraFacade.findAll();
    }

    public void emptyVariables() {
        this.name = "";
        this.groups = "";
        this.textbook_plant = "";
    }

    public String createKafedra() {
        this.kafedra.setName(this.name);
        this.kafedra.setGroups(this.groups);
        this.kafedra.setTextbookPlants(this.textbook_plant);
        this.KafedraFacade.create(this.kafedra);
        this.emptyVariables();
        return "LeftPage(kafedra).xhtml?faces-redirect=true";
    }

    public String updateKafedra(Kafedra kafedra) {
        this.KafedraFacade.edit(this.selectedKafedra);
        return "LeftPage(kafedra).xhtml?faces-redirect=true";
    }

    public String deleteKafedra(Kafedra kafedra) {
        this.KafedraFacade.remove(kafedra);
        return "LeftPage(kafedra).xhtml?faces-redirect=true";
    }

}
