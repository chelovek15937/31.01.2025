/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.UserFacadeLocal;

/**
 *
 * @author Student 2
 */
@Named(value = "UserController")
@SessionScoped
public class UserController implements Serializable {

    @EJB
    private UserFacadeLocal UserFacade;

    private User selectedUser;

    private User user = new User();
    private String username;
    private String pass;
    private String name_mother_father;
    private String adres;
    private String login;

    public UserController() {
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName_mother_father() {
        return name_mother_father;
    }

    public void setName_mother_father(String name_mother_father) {
        this.name_mother_father = name_mother_father;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<User> getAllUser() {
        return this.UserFacade.findAll();
    }

    public void emptyVariables() {
        this.username = "";
        this.pass = "";
        this.name_mother_father = "";
        this.adres = "";
        this.login = "";
    }

    public String createUser() {
        this.user.setUser(this.username);
        this.user.setPass(this.pass);
        this.user.setNamemotherfather(this.name_mother_father);
        this.user.setAdres(this.adres);
        this.user.setLogin(this.login);
        this.UserFacade.create(this.user);
        this.emptyVariables();
        return "TopPage(registration).xhtml?faces-redirect=true";
    }

    public String updateUser(User user) {
        this.UserFacade.edit(this.selectedUser);
        return "TopPage(registration).xhtml?faces-redirect=true";
    }

    public String deleteUser(User user) {
        this.UserFacade.remove(user);
        return "TopPage(registration).xhtml?faces-redirect=true";
    }

}
