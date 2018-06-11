package Exceptions;

public class BillTitleNotInDBException extends ELabException {
	
	public BillTitleNotInDBException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Keine Rechnung mit diesem Namen vorhanden";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
