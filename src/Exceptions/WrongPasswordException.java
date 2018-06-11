package Exceptions;

public class WrongPasswordException extends ELabException {

	public WrongPasswordException(){

	}

	@Override
	public String getMessage(){
		return "Falsches Passwort! Bitte erneut versuchen.";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}