package Exceptions;

public class ComponentNameNotInDBException extends ELabException {

	public ComponentNameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Bauteil mit diesem Namen vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
