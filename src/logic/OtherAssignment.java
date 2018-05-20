package logic; 
public class OtherAssignment extends Assignment {
    private String notes;
    
   
    public OtherAssignment(){
	super(); 
    }
    
    public OtherAssignment(String titel,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes){
	super(titel,type,forecastedCosts,realCosts,assignmentStatus); 
	this.notes = notes; 
    }
    public String getNotes() {
	return notes; 
    }
    public void setNotes(String notes) {
	this.notes = notes; 
    }
}
