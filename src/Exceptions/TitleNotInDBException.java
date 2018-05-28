package Exceptions;

public class TitleNotInDBException extends ELabException {

	public TitleNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Assignment with specified title in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
