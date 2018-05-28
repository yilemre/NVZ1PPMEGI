package Exceptions;

public class StatusNotInDBException extends ELabException {

	public StatusNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Assignment with specified status in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
