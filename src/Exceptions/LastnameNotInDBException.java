package Exceptions;

public class LastnameNotInDBException extends ELabException{

	public LastnameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Person with specified lastname in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
