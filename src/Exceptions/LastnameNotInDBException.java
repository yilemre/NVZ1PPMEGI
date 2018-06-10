package Exceptions;

public class LastnameNotInDBException extends ELabException{

	public LastnameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Keine Person mit diesem Nachnamen vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
