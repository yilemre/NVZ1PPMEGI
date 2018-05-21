package logic; 

public class PCBAssignment extends Assignment {
    
    public PCBAssignment() {
	super(); 
    }
    
    public PCBAssignment(String titel,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes){
	super(titel,type,forecastedCosts,assignmentStatus); 
    }

}
