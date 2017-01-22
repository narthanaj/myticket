/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static classes.dbconnect.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.userpanel;

/**
 *
 * @author root
 */
public class Admin extends dbconnect{
    
   //admin datils
    private String AdminUname;
    private String AdminPW;
    
   //user datils 
    private int userID;
    private String userName;
    private String email;
    private String password;
    private int UserTPNO;
    private String Picture;
    private String gender;
    
   //bus datils
    private int busID;
    private String busName;
    private String busOwnerName;
    private String busTP;
    private String rootAddress;
    private String Type;
   
   //fair datils
    
    private String to;
    private String from;
    private int km;
    
    
     PreparedStatement pst;
     ResultSet rs;

    public String getAdminUname() {
        return AdminUname;
    }

    public void setAdminUname(String AdminUname) {
        this.AdminUname = AdminUname;
    }

    public String getAdminPW() {
        return AdminPW;
    }

    public void setAdminPW(String AdminPW) {
        this.AdminPW = AdminPW;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserTPNO() {
        return UserTPNO;
    }

    public void setUserTPNO(int UserTPNO) {
        this.UserTPNO = UserTPNO;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusOwnerName() {
        return busOwnerName;
    }

    public void setBusOwnerName(String busOwnerName) {
        this.busOwnerName = busOwnerName;
    }

    public String getBusTP() {
        return busTP;
    }

    public void setBusTP(String busTP) {
        this.busTP = busTP;
    }

    public String getRootAddress() {
        return rootAddress;
    }

    public void setRootAddress(String rootAddress) {
        this.rootAddress = rootAddress;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
    
}


