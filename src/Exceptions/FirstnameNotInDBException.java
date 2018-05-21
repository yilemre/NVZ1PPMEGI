package Exceptions;

public class FirstnameNotInDBException extends ELabException {

	public FirstnameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Person with specified firstname in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
