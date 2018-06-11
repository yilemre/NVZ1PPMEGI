package Exceptions;

public class PotNotInDBException extends ELabException {

	public PotNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Pot mit dieser ID in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
