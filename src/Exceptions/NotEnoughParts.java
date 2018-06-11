package Exceptions;

public class NotEnoughParts extends ELabException {
public NotEnoughParts() {
	
    }
    public String getMessage() {
	return "Die ausgewählte Menge ist zu groß!"; 	
    }
    public String toString () {
	return getMessage(); 
    }


}
