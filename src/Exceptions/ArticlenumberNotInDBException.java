package Exceptions;

public class ArticlenumberNotInDBException extends ELabException {

	public ArticlenumberNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Bauteil mit dieser Nummer vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}

}
