package Exceptions;

public class UsernameNotInDBException extends ELabException {

	public UsernameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Username not in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}