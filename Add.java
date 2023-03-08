/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guics;

/**
 *
 * @author User
 */
public class Add {
    String code;
    String name;
    String peripheral;
    String assignedTo;
    
    Add(String code, String name, String peripheral, String assignedTo){
        this.code = code;
        this.name = name;
        this.peripheral = peripheral;
        this.assignedTo = assignedTo;
    }

    public String getCode(){
        return this.code;
    }
    public void setName(String name){
        this.name = name;   
    }
    public String getName(){
        return this.name;
    }
    public void setPeripheral(String peripheral){
        this.peripheral = peripheral;
    }
    public String getPeripheral(){
        return this.peripheral;
    }
    public void setAssignedTo(String assignedTo){
        this.assignedTo = assignedTo;
    }
    public String getAssignedTo(){
        return this.assignedTo;
    }
    public void display(){
        System.out.println("Peripheral code is " + code + " " + " and Peripheral name is " + name + ". Assigned to " + assignedTo );
    }
}

