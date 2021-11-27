/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane;
/**
 *
 * @author Keizer
 */
public class Tables {
    public static void main(String [] args){
        try{
        String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(200),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
        String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('admin','admin@gmail.com','1234567890','Hawler','admin','Which primary school did you attend ?','ABC','true')";
        DbOperations.setDataOrDelete(userTable, "User Table created successfully");
        DbOperations.setDataOrDelete(adminDetails, "Admin details added successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
