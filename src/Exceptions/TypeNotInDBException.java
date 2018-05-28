package Exceptions;

public class TypeNotInDBException extends ELabException {

	public TypeNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Assignment with specified type in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
