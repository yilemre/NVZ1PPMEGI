package Exceptions;

public class BillDateNotInDBException extends ELabException {
	
	public BillDateNotInDBException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Keine Rechnung mit diesem Datum vorhanden";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
