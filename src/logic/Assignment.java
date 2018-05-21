package logic;

import java.sql.Timestamp;

public abstract class Assignment {
    //private final int assignment_id; 
    //private static int count_id =0; 
    private String titel;
    private String type; 
    private double forecastedCosts;
    private double realCosts;
    private int assignmentStatus;
    private final Timestamp date;
    
    public Assignment(){
	//this.assignment_id = count_id; 
	//count_id++; 
	date = new Timestamp(System.currentTimeMillis()); 
    }
    
    public Assignment(String titel,String type, double forecastedCosts,int assignmentStatus){
	//this.assignment_id = count_id; 
	//count_id++; 
	this.titel = titel; 
	this.type = type;
	this.forecastedCosts = forecastedCosts; 
	this.assignmentStatus = assignmentStatus; 
	this.date = new Timestamp(System.currentTimeMillis()); 
    }

    /*public static int getCount_id() {
        return count_id;
    }*/

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getForecastedCosts() {
        return forecastedCosts;
    }

    public void setForecastedCosts(double forecastedCosts) {
        this.forecastedCosts = forecastedCosts;
    }

    public double getRealCosts() {
        return realCosts;
    }

    public void setRealCosts(double realCosts) {
        this.realCosts = realCosts;
    }

    public int getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(int assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /*public int getAssignment_id() {
        return assignment_id;
    }*/

    public Timestamp getDate() {
        return date;
    }
    
    
    
}
