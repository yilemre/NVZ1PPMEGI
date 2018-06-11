package Exceptions;

public class UsernameNotInDBException extends ELabException {

	public UsernameNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Username nicht vergeben!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}