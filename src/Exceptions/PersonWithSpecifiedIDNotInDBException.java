package Exceptions;

public class PersonWithSpecifiedIDNotInDBException extends ELabException {

	public PersonWithSpecifiedIDNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Person mit entsprechender ID nicht in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
