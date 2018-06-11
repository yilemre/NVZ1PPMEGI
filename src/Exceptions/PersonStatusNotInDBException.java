package Exceptions;

public class PersonStatusNotInDBException extends ELabException {

	public PersonStatusNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Keine Person mit diesem Status vorhanden";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
