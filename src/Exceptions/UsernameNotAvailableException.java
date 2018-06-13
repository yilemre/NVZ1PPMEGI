package Exceptions;

public class UsernameNotAvailableException extends ELabException {
	
	public UsernameNotAvailableException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Dieser Username ist bereits vergeben!";
	}

	@Override
	public String toString(){
		return getMessage();
	}
}
