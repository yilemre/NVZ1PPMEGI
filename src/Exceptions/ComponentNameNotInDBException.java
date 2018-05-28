package Exceptions;

public class ComponentNameNotInDBException extends ELabException {

	public ComponentNameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Component with specified name in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
