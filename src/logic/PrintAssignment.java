package logic; 
public class PrintAssignment extends Assignment {
    
    public PrintAssignment(String titel,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes){
	super(titel,type,forecastedCosts,realCosts,assignmentStatus);
    }
    
    public PrintAssignment(){
	super(); 
    }
	
}
