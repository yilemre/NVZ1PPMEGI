package Exceptions;

public class FirstnameNotInDBException extends ELabException {

	public FirstnameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Keine Person mit diesem Vornamen vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
