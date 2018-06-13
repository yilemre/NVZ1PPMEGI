package Exceptions;

public class BillIDNotInDBException extends ELabException {

	@Override
	public String getMessage() {
		return "Specified Bill ID was not found in the database!";
	}

	@Override
	public String toString() {
		return getMessage();
	}
	
	

}
