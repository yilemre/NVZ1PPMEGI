package logic;

import java.sql.Timestamp;

public abstract class Assignment {
    final int assignment_id = 1;
    private String titel;
    private String type; 
    private double forecastedCosts;
    private double realCosts;
    private int assignmentStatus;
    private Timestamp date;
    
    public Assignment(){	
    }
    
    public Assignment(String titel,String type, double forecastedCosts, double realCosts,int assignmentStatus){
	this.titel = titel; 
	this.type = type;
	this.forecastedCosts = forecastedCosts; 
	this.realCosts = realCosts; 
	this.assignmentStatus = assignmentStatus; 
	this.date = new Timestamp(System.currentTimeMillis()); 
    }
    
    
}
