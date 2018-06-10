package Exceptions;

public class WrongPasswordException extends ELabException {

	public WrongPasswordException(){

	}

	@Override
	public String getMessage(){
		return "Password is wrong, please try again!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}