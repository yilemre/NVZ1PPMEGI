package Exceptions;

public class BillStatusNotInDBException extends ELabException {
	
	public BillStatusNotInDBException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Keine Rechnung mit diesem Status vorhanden";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
