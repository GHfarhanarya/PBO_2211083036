/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan080423;

import farhan010423.StudentRecord;
/**
 *
 * @author hp
 */

public class ExtendStudent extends StudentRecord{
    
    private double compGrade;
    
     public double getCompGrade(){ 
        return compGrade; 
    }
    
    public void setCompGrade(double compGrade){
        this.compGrade = compGrade; 
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    public static void main(String[] args){
        ExtendStudent n = new ExtendStudent();
        
      n.setName ("juki");
      n.setCompGrade(99);
      
      System.out.println("Nama  : "+n.getName());
      System.out.println("Comp Grade  : "+n.getCompGrade());
      
    }
    
}
